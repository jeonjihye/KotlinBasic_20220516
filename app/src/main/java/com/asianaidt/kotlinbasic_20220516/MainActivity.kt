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

        btnToast.setOnLongClickListener{

            Log.d("메인화면","로그 버튼이 길게 눌림")

            return@setOnLongClickListener true
        }

        btnLog.setOnClickListener {
//          토스트 띄우기
            Toast.makeText(this,"테스트용 토스트",Toast.LENGTH_SHORT).show()

        }

        btnVariable.setOnClickListener {

            //변수 문법 테스트

            var name1 : String // 변수
            val name2 : String // 상수

            // 최초 대입은 val/var 둘다 가능
            name1 = "지혜"
            name2 = "철수"

            name1 = "졔"
//            name2 = "영희"

            val year1 = 1998 // 자동으로 Int로 설정

        }

        btnCondition.setOnClickListener {

//            1. if 문 테스트

            val userAge = 18
            if (userAge >= 20){
                Toast.makeText(this,"성인입니다",Toast.LENGTH_SHORT).show()
            }else if(userAge >= 17){
                Toast.makeText(this,"고등학생입니다",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"중학생 이하 입니다",Toast.LENGTH_SHORT).show()
            }

//            2. when 테스트

            val num = 30
            when (num){
                10 -> {
                    Log.d("when 테스트" ,"10인 경우")
                }
                15 -> {
                    Log.d("when","15인 경우 - 코드 한줄")
                }
                20,30,40, -> Log.d("when","20,30,40 중 하나")
                in 41..100 -> Log.d("when","41부터 100 사이의 값")
                else -> Log.d("when","그 외의 모든 경우")
            }
        }

        btnRepeat.setOnClickListener {
//            1. 정석 - arrayList 연계
            val studentList = ArrayList<String>()
            studentList.add("전지혜")
            studentList.add("전관")
            studentList.add("전형욱")

            for(name in studentList){
                Log.d("정석 for 문", name)
            }


//            2. 0~4 / 0~5 직전 (자바식 for 문)
            for(i in 0..4){
                Log.d("0~4",i.toString())
            }

            for(i in 0 until 5){
                Log.d("0~5직전",i.toString())
            }





        }

    }


}