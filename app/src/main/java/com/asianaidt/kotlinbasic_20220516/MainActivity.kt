package com.asianaidt.kotlinbasic_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {
            // btnLog가 클릭되면 할 일
            Log.d("메인화면", "로그 찍기 버튼 눌림")

        }

        btnLog.setOnLongClickListener{

            Log.d("메인화면","로그 버튼이 길게 눌림")

            return@setOnLongClickListener true
        }

        btnLog.setOnClickListener {
//          토스트 띄우기
            Toast.makeText(this,"테스트용 토스트",Toast.LENGTH_SHORT).show()

        }

        btnLog.setOnClickListener {

            //변수 문법 테스트

            var name1 : String // 변수
            val name2 : String // 상수

            // 최초 대입은 val/var 둘다 가능
            name1 = "지혜"
            name2 = "철수"

            name1 = "졔"
//            name2 = "영희"

        }


    }


}