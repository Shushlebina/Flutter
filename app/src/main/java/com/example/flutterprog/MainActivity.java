package com.example.flutterprog;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Устанавливаем макет для этой активности
        setContentView(R.layout.activity_main);

        // Получаем ссылку на кнопку "Теория"
        Button button1 = findViewById(R.id.button1);

        // Настраиваем обработчик событий для кнопки "Теория"
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаем намерение для запуска активности "TheoryActivity"
                Intent intent = new Intent(MainActivity.this, TheoryActivity.class);
                // Запускаем активность "TheoryActivity"
                startActivity(intent);
            }
        });

        // Получаем ссылку на кнопку "Тест"
        Button button2 = findViewById(R.id.button2);

        // Настраиваем обработчик событий для кнопки "Тест"
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаем намерение для запуска активности "TestActivity"
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                // Запускаем активность "TestActivity"
                startActivity(intent);
            }
        });
    }
}
