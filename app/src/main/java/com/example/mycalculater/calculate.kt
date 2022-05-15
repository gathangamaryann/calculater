package com.example.mycalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculate : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubstract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus= findViewById(R.id.btnModulus)
        etNum1=findViewById(R.id.etNum1)
        etNum2=findViewById(R.id.etNum2)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            val num1= etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("number is required ")
                return@setOnClickListener
            }
            addition(num1.toInt(), num2.toInt())

        }

        btnSubtract.setOnClickListener {
            val num1= etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("number is required ")
                return@setOnClickListener
            }
            subtract(num1.toInt(), num2.toInt())


        }
        btnMultiply.setOnClickListener {
            val num1= etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("number is required ")
                return@setOnClickListener
            }

            multiply(num1.toInt(), num2.toInt())



    }
        btnModulus.setOnClickListener {
            val num1= etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("number is required ")
                return@setOnClickListener
            }
            modulus(num1.toInt(), num2.toInt())

        }


    }
    fun addition(num1:Int, num2:Int){
        var add=num1+num2
        tvResult.text=add.toString()
    }
    fun subtract(num1:Int, num2:Int){
        var subtract=num1-num2
        tvResult.text=subtract.toString()
    }
    fun multiply(num1:Int, num2:Int){
        var multiply=num1*num2
        tvResult.text=multiply.toString()
    }
    fun modulus(num1:Int, num2:Int){
        var modulus=num1%num2
        tvResult.text=modulus.toString()
    }

    }