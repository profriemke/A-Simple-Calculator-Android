package net.riemke.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var n1:Int = 0
    var n2:Int = 0
    var op="none"
    var operand=1;


    fun addDigit(d:Int, tv:TextView){
        var v=""
        if (operand==1){
            if(this.n1==0){
                v = d.toString()
                this.n1 = d.toInt()
            }else {
                v = this.n1.toString()+d.toString()
                this.n1 = v.toInt()
            }
        }else{
            if(this.n2==0){
                v = d.toString()
                this.n2 = d

            }else {
                 v = this.n2.toString()+d.toString()
                this.n2 = v.toInt() }
        }
        tv.text=v

    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1= findViewById<Button>(R.id.btn1)
        val btn2= findViewById<Button>(R.id.btn2)
        val btn3= findViewById<Button>(R.id.btn3)
        val btn4= findViewById<Button>(R.id.btn4)
        val btn5= findViewById<Button>(R.id.btn5)
        val btn6= findViewById<Button>(R.id.btn6)
        val btn7= findViewById<Button>(R.id.btn7)
        val btn8= findViewById<Button>(R.id.btn8)
        val btn9= findViewById<Button>(R.id.btn9)
        val btn0= findViewById<Button>(R.id.btn0)
        val btnDivide= findViewById<Button>(R.id.btnDivide)
        val btnPlus= findViewById<Button>(R.id.btnPlus)
        val btnMinus= findViewById<Button>(R.id.btnMinus)
        val btnClear= findViewById<Button>(R.id.btnClear)
        val btnEquals= findViewById<Button>(R.id.btnEquals)
        val btnMultiply= findViewById<Button>(R.id.btnMultiply)
        val tv1= findViewById<TextView>(R.id.tv1)
        Log.i("BTN", "Init")

       btn1.setOnClickListener{
           this.addDigit(1, tv1)
           Log.i("BTN", "1")
       }
        btn2.setOnClickListener{
            this.addDigit(2, tv1)
            Log.i("BTN", "2")
        }

        btn3.setOnClickListener{
            this.addDigit(3, tv1)
            Log.i("BTN", "3")
        }
        btn4.setOnClickListener{
            this.addDigit(4, tv1)
        }
        btn5.setOnClickListener{
            this.addDigit(5, tv1)
        }
        btn6.setOnClickListener{
            this.addDigit(6, tv1)
        }
        btn7.setOnClickListener{
            this.addDigit(7, tv1)
        }
        btn8.setOnClickListener{
            this.addDigit(8, tv1)
        }
        btn9.setOnClickListener{
            this.addDigit(9, tv1)
        }
        btn0.setOnClickListener{
            this.addDigit(0, tv1)
        }

        btnMinus.setOnClickListener{
            this.op="-"
            operand=2
        }
        btnDivide.setOnClickListener{
            this.op="/"
            operand=2
        }
        btnClear.setOnClickListener{
            this.op="none"
            tv1.text="0"
            this.n1=0
            this.n2=0
            operand=1
        }
        btnPlus.setOnClickListener{
            this.op="+"
            operand=2
        }
        btnMultiply.setOnClickListener{
            this.op="*"
            operand=2
        }
        btnEquals.setOnClickListener{
            if (this.op=="+") {
                tv1.text = (n1 + n2).toString()
                this.op="none"
            }
            if (this.op=="*") {
                tv1.text = (n1 * n2).toString()
                this.op="none"
            }
            if (this.op=="/") {
                var r:Float
                r= (this.n1.toFloat()/this.n2.toFloat())
                tv1.text = r.toString()
                this.op="none"
            }
            if (this.op=="-") {
                tv1.text = (n1 - n2).toString()
                this.op="none"
            }
            this.n1=0
            this.n2=0
            operand=1;

        }
    }
}