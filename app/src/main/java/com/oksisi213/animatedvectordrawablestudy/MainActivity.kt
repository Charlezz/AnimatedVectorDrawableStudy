package com.oksisi213.animatedvectordrawablestudy

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		record.setOnClickListener {
			if (record.tag == null) {
				record.setImageResource(R.drawable.anim_vector_record_to_stop)
				(record.drawable as AnimatedVectorDrawable).start()
				record.tag = 0
			} else {
				record.setImageResource(R.drawable.anim_vector_stop_to_record)
				(record.drawable as AnimatedVectorDrawable).start()
				record.tag = null
			}
		}
	}
}
