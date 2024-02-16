package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding
//import kotlinx.android.synthetic.main.activity_main.btnadd
//import kotlinx.android.synthetic.main.activity_main.btndivide
//import kotlinx.android.synthetic.main.activity_main.btnmultiply
//import kotlinx.android.synthetic.main.activity_main.btnsub
//import kotlinx.android.synthetic.main.activity_main.edtNo1
//import kotlinx.android.synthetic.main.activity_main.edtNo2


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnadd.setOnClickListener {
            if (binding.edtNo1.text.toString() != "" && binding.edtNo2.text.toString() != "") {
                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()
                val total = no1 + no2
                Toast.makeText(this, "The sum is $total", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this, "please fill all the required blanks", Toast.LENGTH_LONG)
                    .show()
            }
        }


            binding.btnsub.setOnClickListener {
                if (binding.edtNo1.text.toString() != "" && binding.edtNo2.text.toString() != "") {
                    val no1 = binding.edtNo1.text.toString().toInt()
                    val no2 = binding.edtNo2.text.toString().toInt()
                    var sub: Int = 0
                    sub = if (no1 > no2) {
                        no1 - no2
                    } else {
                        no2 - no1
                    }
                    Toast.makeText(this, "The subtraction is $sub", Toast.LENGTH_LONG).show()

                } else {
                    Toast.makeText(this, "please fill all the required blanks", Toast.LENGTH_LONG)
                        .show()
                }
            }

                binding.btnmultiply.setOnClickListener {
                    if (binding.edtNo1.text.toString() != "" && binding.edtNo2.text.toString() != "") {
                        val no1 = binding.edtNo1.text.toString().toInt()
                        val no2 = binding.edtNo2.text.toString().toInt()
                        val mult = no1 * no2
                        Toast.makeText(this, "The Multiplication is $mult", Toast.LENGTH_LONG)
                            .show()

                    } else {
                        Toast.makeText(
                            this,
                            "please fill all the required blanks",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }



                    binding.btndivide.setOnClickListener {
                        if (binding.edtNo1.text.toString() != "" && binding.edtNo2.text.toString() != "") {
                            val no1 = binding.edtNo1.text.toString().toInt()
                            val no2 = binding.edtNo2.text.toString().toInt()

                            if(no2==0)
                            {
                                Toast.makeText(this,"A number cant be zero",Toast.LENGTH_LONG).show()
                            }
                            else {
                                val divide = no1 / no2
                                Toast.makeText(this, "The division is $divide", Toast.LENGTH_LONG).show()
                            }
                        } else {
                            Toast.makeText(
                                this,
                                "please fill all the required blanks",
                                Toast.LENGTH_LONG
                            ).show()
                        }

                    }
                }
            }


