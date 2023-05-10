package com.example.flutterprog;
// Импорт класса Intent из пакета android.content
import android.content.Intent;
// Импорт класса View из пакета android.view
import android.view.View;
// Импорт класса AppCompatActivity из пакета androidx.appcompat.app
import androidx.appcompat.app.AppCompatActivity;
// Импорт класса Bundle из пакета android.os
import android.os.Bundle;
// Импорт класса Button из пакета android.widget
import android.widget.Button;

// Определение класса TheoryActivity, который наследуется от AppCompatActivity
public class TheoryActivity extends AppCompatActivity {

    // Метод onCreate вызывается при создании активности
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Вызов метода onCreate у родительского класса и передача ему сохраненного состояния
        super.onCreate(savedInstanceState);
        // Установка макета для активности с помощью метода setContentView и передача идентификатора ресурса
        setContentView(R.layout.activity_theory);

        // Получение ссылки на кнопку с идентификатором buttonBack в макете
        Button buttonBack = findViewById(R.id.buttonBack);
        // Установка обработчика нажатия на кнопку
        buttonBack.setOnClickListener(new View.OnClickListener() {
            // Определение метода onClick для обработки нажатия на кнопку
            @Override
            public void onClick(View v) {
                // Создание нового объекта Intent для перехода на другую активность (MainActivity)
                Intent intent = new Intent(TheoryActivity.this, MainActivity.class);
                // Запуск активности MainActivity
                startActivity(intent);
            }
        });
    }
}