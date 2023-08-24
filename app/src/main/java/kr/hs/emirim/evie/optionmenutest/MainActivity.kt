package kr.hs.emirim.evie.optionmenutest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "배경색과 버튼 변경"
        linear = findViewById(R.id.linear)
        btn = findViewById(R.id.btn)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean { // 메뉴
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { // 이벤트
        when(item.itemId){
            R.id.itemRed -> {
                linear.setBackgroundColor(Color.RED)
                return true
            }
            R.id.itemBlue -> {
                linear.setBackgroundColor(Color.BLUE)
                return true
            }
            R.id.itemMagenta -> {
            linear.setBackgroundColor(Color.MAGENTA)
            return true
            }

            R.id.subRotate -> { // 항목 중에 sub
                btn.rotation += 45f
                return true
            }

            R.id.subSize -> { // 항목 중에 sub
                btn.scaleX *= 2f
                return true
            }

            R.id.subInit -> {
                btn.rotation = 0f
                return true
            }
        }
        return false
    }
}