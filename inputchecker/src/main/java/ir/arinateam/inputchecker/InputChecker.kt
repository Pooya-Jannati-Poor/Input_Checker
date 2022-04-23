package ir.arinateam.inputchecker

import android.content.Context
import android.widget.Toast

class InputChecker {

    companion object {

        const val PASSWORD = 1
        const val PHONE = 2
        const val USERNAME = 3
        const val EMAIL = 4

        const val LENGTH_SHORT = Toast.LENGTH_SHORT
        const val LENGTH_LONG = Toast.LENGTH_LONG

        fun checkInput(
            context: Context,
            inputType: Int,
            inputText: String,
            minLength: Int,
            toastDuration: Int
        ): Boolean {

            if (inputText.isEmpty()) {

                when (inputType) {

                    PASSWORD -> {
                        // Toast for complete password
                        Toast.makeText(context, R.string.empty_password, toastDuration).show()
                    }
                    PHONE -> {
                        // Toast for complete phone
                        Toast.makeText(context, R.string.empty_phone_number, toastDuration).show()
                    }
                    USERNAME -> {
                        // Toast for complete username
                        Toast.makeText(context, R.string.empty_username, toastDuration).show()
                    }
                    EMAIL -> {
                        // Toast for complete email
                        Toast.makeText(context, R.string.empty_email, toastDuration).show()
                    }

                }

                return false


            } else if (inputText.length < minLength) {

                when (inputType) {

                    PASSWORD -> {
                        // Toast for complete password
                        Toast.makeText(
                            context,
                            String.format(
                                context.getString(R.string.wrong_format_password),
                                minLength
                            ),
                            toastDuration
                        )
                            .show()
                    }
                    PHONE -> {
                        // Toast for complete phone
                        Toast.makeText(
                            context,
                            String.format(
                                context.getString(R.string.wrong_format_phone_number),
                                minLength
                            ),
                            toastDuration
                        )
                            .show()
                    }
                    USERNAME -> {
                        // Toast for complete username
                        Toast.makeText(
                            context,
                            String.format(
                                context.getString(R.string.wrong_format_username),
                                minLength
                            ),
                            toastDuration
                        )
                            .show()
                    }
                    EMAIL -> {
                        // Toast for complete email
                        Toast.makeText(
                            context,
                            String.format(
                                context.getString(R.string.wrong_format_email),
                                minLength
                            ),
                            toastDuration
                        ).show()
                    }

                }

                return false

            }

            return true

        }

        fun checkInput(context: Context, inputType: Int, minLength: Int, maxLength: Int) {

        }

    }

}