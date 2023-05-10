package com.example.flutterprog;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
// Объявление класса, который наследует свойства и методы от AppCompatActivity
public class SplashScreenActivity extends AppCompatActivity {

    // Метод, который вызывается при создании активности
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Вызов метода родительского класса, в котором происходит инициализация активности
        super.onCreate(savedInstanceState);
        // Установка макета для активности, в котором описывается внешний вид
        setContentView(R.layout.activity_splash_screen);

        // Создание нового объекта класса Handler, который будет выполнять задержку выполнения кода
        new Handler().postDelayed(new Runnable() {
            // Описание метода run(), который будет выполняться после задержки
            @Override
            public void run() {
                // Создание нового намерения, которое запускает активность MainActivity
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                // Запуск активности MainActivity
                startActivity(intent);
                // Завершение текущей активности SplashScreenActivity
                finish();
            }
        }, 3000); // Задержка выполнения кода на 3 секунды (3000 миллисекунд)
    }
}
