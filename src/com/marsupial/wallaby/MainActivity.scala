package com.marsupial.wallaby

import android.app.Activity
import android.os.Bundle

class MainActivity extends Activity {

  /**
   * Called when the activity is first created.
   */
  override def onCreate(saved: Bundle) {
    super.onCreate(saved)
    setContentView(R.layout.main)
  }

}
