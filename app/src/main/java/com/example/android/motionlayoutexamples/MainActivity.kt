package com.example.android.motionlayoutexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click_to_move_button.setOnClickListener {
            replaceFragment(MoveOnClickFragment())
        }

        drag_shape_button.setOnClickListener {
            replaceFragment(DragCircleFragment())
        }

        change_shape_drag.setOnClickListener {
            replaceFragment(ChangeShapeOnDragFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
