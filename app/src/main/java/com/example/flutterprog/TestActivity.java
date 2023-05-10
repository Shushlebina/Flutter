// импортируем класс Intent для перехода на другую активность
// и класс View для работы с виджетами пользовательского интерфейса
package com.example.flutterprog;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
// импортируем классы Button, RadioButton и RadioGroup для работы с кнопками, радиокнопками и радиогруппами
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
// импортируем класс Toast для отображения сообщений всплывающих уведомлений
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
    // объявляем радиогруппы, содержащие ответы на вопросы теста
    private RadioGroup answerRadiogroup1;
    private RadioGroup answerRadiogroup2;
    private RadioGroup answerRadiogroup3;
    private RadioGroup answerRadiogroup4;
    private RadioGroup answerRadiogroup5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // создаем объект кнопки и устанавливаем на нее слушатель нажатий
        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // создаем объект Intent для перехода на главную активность
                Intent intent = new Intent(TestActivity.this, MainActivity.class);
                startActivity(intent); // запускаем новую активность
            }
        });

        // находим радиогруппы ответов на вопросы теста по их идентификаторам
        answerRadiogroup1 = findViewById(R.id.answer_radiogroup1);
        answerRadiogroup2 = findViewById(R.id.answer_radiogroup2);
        answerRadiogroup3 = findViewById(R.id.answer_radiogroup3);
        answerRadiogroup4 = findViewById(R.id.answer_radiogroup4);
        answerRadiogroup5 = findViewById(R.id.answer_radiogroup5);

        // создаем объект кнопки "Завершить тест" и устанавливаем на нее слушатель нажатий
        Button submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int correctAnswers = 0; // количество правильных ответов

                // получаем идентификатор выбранных ответов для каждого вопроса
                int selectedAnswerId1 = answerRadiogroup1.getCheckedRadioButtonId();
                int selectedAnswerId2 = answerRadiogroup2.getCheckedRadioButtonId();
                int selectedAnswerId3 = answerRadiogroup3.getCheckedRadioButtonId();
                int selectedAnswerId4 = answerRadiogroup4.getCheckedRadioButtonId();
                int selectedAnswerId5 = answerRadiogroup5.getCheckedRadioButtonId();

                // проверяем, что на все вопросы даны ответы
                if (selectedAnswerId1 == -1 || selectedAnswerId2 == -1 || selectedAnswerId3 == -1 || selectedAnswerId4 == -1 || selectedAnswerId5 == -1) {
                    Toast.makeText(TestActivity.this, "Прежде, чем закончить тест, вы должны ответить на все вопросы :)", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton selectedAnswer1 = findViewById(selectedAnswerId1);
                RadioButton selectedAnswer2 = findViewById(selectedAnswerId2);
                RadioButton selectedAnswer3 = findViewById(selectedAnswerId3);
                RadioButton selectedAnswer4 = findViewById(selectedAnswerId4);
                RadioButton selectedAnswer5 = findViewById(selectedAnswerId5);
                // проверяем какие ответы были выбраны и сравниваем их с указанными верными ответами
                if (selectedAnswer1.getId() == R.id.answer2_radiobutton1) {
                    correctAnswers++;
                }

                if (selectedAnswer2.getId() == R.id.answer2_radiobutton2) {
                    correctAnswers++;
                }

                if (selectedAnswer3.getId() == R.id.answer3_radiobutton3) {
                    correctAnswers++;
                }
                if (selectedAnswer4.getId() == R.id.answer1_radiobutton4) {
                    correctAnswers++;
                }

                if (selectedAnswer5.getId() == R.id.answer4_radiobutton5) {
                    correctAnswers++;
                }
                // выводим количество правильных ответов
                Toast.makeText(TestActivity.this, "Правильных ответов: " + correctAnswers, Toast.LENGTH_SHORT).show();
            }
        });
    }
}