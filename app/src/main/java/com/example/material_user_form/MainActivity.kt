package com.example.material_user_form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import com.example.material_user_form.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener, RadioGroup.OnCheckedChangeListener,
    CompoundButton.OnCheckedChangeListener {
    private lateinit var binding: ActivityMainBinding
    var gender:String?=null
    //private var arraylist:ArrayList<String> = ArrayList()
    //var array:ArrayList<String>=ArrayList()
    var arraylist:ArrayList<String> = ArrayList()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmit.setOnClickListener(this)
        binding.rdGp.setOnCheckedChangeListener(this)
        binding.chGaming.setOnCheckedChangeListener(this)
        binding.chCo.setOnCheckedChangeListener(this)
        binding.chPc.setOnCheckedChangeListener(this)
        binding.chRb.setOnCheckedChangeListener(this)
        binding.chTr.setOnCheckedChangeListener(this)


    }

    override fun onClick(p0: View?) {
        val fname=binding.tilFname.editText?.text.toString()
        val lname=binding.tilLname.editText?.text.toString()
        val monumber=binding.MobNo.editText?.text.toString()
        val almonumber=binding.AltMobNo.editText?.text.toString()
        val email=binding.emailAdd.editText?.text.toString()
        val intent=Intent(this,datapage::class.java)

        intent.putExtra("Fname",fname)
        intent.putExtra("lasname",lname)
        intent.putExtra("monumber",monumber)
        intent.putExtra("Alternenu",almonumber)
        intent.putExtra("Email",email)
        intent.putExtra("gender",gender)
        intent.putExtra("hobbiese",arraylist)
        startActivity(intent)




    }

    override fun onCheckedChanged(checked: RadioGroup?, p1: Int) {
        when(checked?.checkedRadioButtonId){
            R.id.rd_male ->{
                gender=binding.rdMale.text.toString()
            }
            R.id.rd_female ->{
                gender=binding.rdFemale.text.toString()
            }
            R.id.rd_trGd -> {
                gender=binding.rdTrGd.text.toString()
            }

        }



    }

    override fun onCheckedChanged(checek: CompoundButton?, p1: Boolean) {
        when(checek?.id){
            R.id.ch_co ->{
                if(binding.chCo.isChecked){
                    arraylist.add(binding.chCo.text.toString())
                }
                else
                {
                    arraylist.remove(binding.chCo.text.toString())
                }
            }
            R.id.ch_pc -> {
                if ( binding.chPc.isChecked) {
               arraylist.add(binding.chPc.toString())
                }
                else{
                    arraylist.remove(binding.chPc.toString())
                }
            }
            R.id.ch_Tr -> {
                if (binding.chTr.isChecked) {
                arraylist.add(binding.chTr.toString())
                }
                else {
                 arraylist.add(binding.chTr.toString())
                }
            }
            R.id.ch_Rb ->{
                if (binding.chRb.isChecked){
                arraylist.add(binding.chRb.toString())
                }
                else {
                   arraylist.remove(binding.chRb.toString())
                }
            }
            R.id.ch_Gaming -> {
                if (binding.chGaming.isChecked) {
                arraylist.add(binding.chGaming.toString())
                }
                else {
               arraylist.remove(binding.chGaming.toString())

                }
            }



        }



    }
}