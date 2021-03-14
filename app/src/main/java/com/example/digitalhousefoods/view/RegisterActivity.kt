package com.example.digitalhousefoods.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.digitalhousefoods.R
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {

    private val textName by lazy { findViewById<TextInputLayout>(R.id.text_layout_name_register) }
    private val editName by lazy { findViewById<TextInputEditText>(R.id.edit_name_register) }
    private val textEmail by lazy { findViewById<TextInputLayout>(R.id.text_layout_email_register) }
    private val editEmail by lazy { findViewById<TextInputEditText>(R.id.edit_email_register) }
    private val textPassword by lazy { findViewById<TextInputLayout>(R.id.text_layout_password_register) }
    private val editPassword by lazy { findViewById<TextInputEditText>(R.id.edit_password_register) }
    private val textRepeatPassword by lazy { findViewById<TextInputLayout>(R.id.text_layout_repeat_password) }
    private val editRepeatPassword by lazy { findViewById<TextInputEditText>(R.id.edit_repeat_password) }
    private val btnRegister by lazy { findViewById<Button>(R.id.btn_register) }
    val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener { onBackPressed() }

        btnRegister.setOnClickListener {
            if (validateRegisterIsNotBlank() && validatePasswordMatch()){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun validatePasswordMatch() : Boolean{

        val password = editPassword?.text.toString()
        val repeatPassword = editRepeatPassword?.text.toString()
        var match = false

        when{
            (repeatPassword != password) -> {
                textPassword?.error = null
                textRepeatPassword?.error = "Password doesn't match"
            }
            else ->{
                textPassword?.error = null
                textRepeatPassword?.error = null
                match = true
            }
        }
        return match

    }
    private fun validateRegisterIsNotBlank() : Boolean{

        val name = editName?.text.toString()
        val email = editEmail?.text.toString()
        val password = editPassword?.text.toString()
        val repeatPassword = editRepeatPassword?.text.toString()
        var isBlank = false

        when {

            name.isBlank() -> {
                textName?.error = "Name is required"
                textEmail?.error = null
                textPassword?.error = null
                textRepeatPassword?.error = null
            }
            email.isBlank() -> {
                textName?.error = null
                textEmail?.error = "Email is required"
                textPassword?.error = null
                textRepeatPassword?.error = null
            }

            password.isBlank() -> {
                textName?.error = null
                textEmail?.error = null
                textPassword?.error = "Password is required"
                textRepeatPassword?.error = null
            }
            repeatPassword.isBlank() -> {
                textName?.error = null
                textEmail?.error = null
                textPassword?.error = null
                textRepeatPassword?.error = "Repeat password is required"
            }
            else -> {
                textName?.error = null
                textEmail?.error = null
                textPassword?.error = null
                textRepeatPassword?.error = null
                isBlank = true
            }
        }
        return isBlank
    }
}