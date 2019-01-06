package com.image.awesomephoto.captureImage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import butterknife.BindView
import butterknife.ButterKnife
import com.image.awesomephoto.R
import com.camerakit.CameraKitView



class CaptureActivity : AppCompatActivity() {

    @BindView(R.id.camera)
    private var cameraKitView: CameraKitView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture2)
        ButterKnife.bind(this)
        cameraKitView = findViewById(R.id.camera);
    }

    override fun onStart() {
        super.onStart()
        cameraKitView!!.onStart();
    }

    override fun onPause() {
        super.onPause()
        cameraKitView!!.onPause()
    }

    override fun onStop() {
        super.onStop()
        cameraKitView!!.onStop()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}