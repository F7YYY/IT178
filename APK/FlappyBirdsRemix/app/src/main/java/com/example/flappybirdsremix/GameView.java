package com.example.flappybirdsremix;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;

public class GameView extends View {
    private int canvasWidth, canvasHeight;
    private static int score;

    private int birdX, birdY, birdHigh;
    private int coinX, coinY, coinSpeed, level;
    private int deadBallX, deadBallY, deadBallSpeed;
    private int lifeCount, incrementation;

    private Paint deadBallPaint = new Paint();
    private Paint scorePaint = new Paint();
    private Paint levelPaint = new Paint();

    private Bitmap background, coin;
    private Bitmap bird[] = new Bitmap[2];
    private Bitmap life[] = new Bitmap[2];

    private boolean onTouchFlag = false;

    public GameView(Context context) {
        super(context);
        bird[0] = BitmapFactory.decodeResource(getResources(), R.drawable.bird1);
        bird[1] = BitmapFactory.decodeResource(getResources(), R.drawable.bird2);

        background = BitmapFactory.decodeResource(getResources(), R.drawable.background);
        coin = BitmapFactory.decodeResource(getResources(), R.drawable.coin);

        scorePaint.setColor(Color.BLACK);
        scorePaint.setTextSize(48);
        scorePaint.setTypeface(Typeface.DEFAULT_BOLD);
        scorePaint.setAntiAlias(true);

        deadBallPaint.setColor(Color.BLACK);
        deadBallPaint.setAntiAlias(false);

        levelPaint.setColor(Color.DKGRAY);
        levelPaint.setTextSize(48);
        levelPaint.setTypeface(Typeface.DEFAULT_BOLD);
        levelPaint.setTextAlign(Paint.Align.CENTER);
        levelPaint.setAntiAlias(true);

        life[0] = BitmapFactory.decodeResource(getResources(), R.drawable.life);
        life[1] = BitmapFactory.decodeResource(getResources(), R.drawable.empty_life);

        birdX = 10;
        birdY = 500;
        score = 0;
        incrementation = score;
        birdHigh = 10;
        coinSpeed = 15;
        deadBallSpeed = 25;
        lifeCount = 3;
        level = 1;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvasWidth = canvas.getWidth();
        canvasHeight = canvas.getHeight();

        canvas.drawBitmap(background, 0, 0, null);

        int maxBirdY = bird[0].getHeight();
        int minBirdY = canvasHeight - bird[0].getHeight() * 5;

        birdY += birdHigh;

        if (birdY < maxBirdY) birdY = maxBirdY;
        if (birdY > minBirdY) birdY = minBirdY;
        birdHigh += 2;

        if (onTouchFlag) {
            canvas.drawBitmap(bird[1], birdX, birdY, null);
            onTouchFlag = false;
        } else {
            canvas.drawBitmap(bird[0], birdX, birdY, null);
        }

        coinX -= coinSpeed;

        if (hitCheck(coinX, coinY)) {
            score++;
            incrementation++;
            coinX = -100;
        }
        if (coinX < 0) {
            coinX = canvasWidth + 20;
            coinY = (int) Math.floor(Math.random() * (maxBirdY - minBirdY)) + minBirdY;
        }
        if (incrementation % 5 == 0 && incrementation != 0) {
            ++level;
            coinSpeed += 2;
            deadBallSpeed += 5;
            incrementation = 0;
        }

        canvas.drawBitmap(coin, coinX, coinY, null);
        deadBallX -= deadBallSpeed;

        if (hitCheck(deadBallX, deadBallY)) {
            deadBallX = -100;
            lifeCount--;
            if (lifeCount == 0) {
                tryAgain();
            }
        }
        if (deadBallX < 0) {
            deadBallX = canvasWidth + 200;
            deadBallY = (int) Math.floor(Math.random() * (maxBirdY - minBirdY)) + minBirdY;
        }

        canvas.drawCircle(deadBallX, deadBallY, 40, deadBallPaint);
        canvas.drawText("Score : " + score, 20, 60, scorePaint);
        canvas.drawText("Lv. " + level, canvasWidth / 2, 60, levelPaint);

        for (int i = 0; i < 3; i++) {
            int x = (int) (800 + life[0].getWidth() * 1.5 * i);
            int y = 20;
            canvas.drawBitmap((i < lifeCount) ? life[0] : life[1],
                    x, y, null);
        }
    }

    public boolean hitCheck(int x, int y) {
        return (birdX < x && x < (birdX + bird[0].getWidth()) && (birdY < y && y < (birdY + bird[0].getHeight())));
    }

    public static int getScore() {
        return score;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            onTouchFlag = true;
            birdHigh = -20;
        }
        return true;
    }

    public void tryAgain() {
        Intent intent = new Intent(getContext(), ResultActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getContext().startActivity(intent);
    }
}
