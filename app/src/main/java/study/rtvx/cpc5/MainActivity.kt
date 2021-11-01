package study.rtvx.cpc5

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


private const val VERSE_LOG_TAG = "VerseLog"


class MainActivity : AppCompatActivity() {

    var firstPartVerse = "Ты видел деву на скале\nВ одежде белой над волнами"
    var secondPartVerse = "Когда, бушуя в бурной мгле,\nИграло море с берегами,"
    var thirdPartVerse = "Когда луч молний озарял\nЕе всечасно блеском алым"
    var quarterPartVerse = "И ветер бился и летал\nС ее летучим покрывалом?"
    var fifthPartVerse = "Прекрасно море в бурной мгле\nИ небо в блесках без лазури;"
    var sixthPartVerse = "Но верь мне: дева на скале\nПрекрасней волн, небес и бури."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(VERSE_LOG_TAG, firstPartVerse)
    }

    override fun onStart() {
        super.onStart()
        Log.d(VERSE_LOG_TAG, secondPartVerse)
    }

    override fun onResume() {
        super.onResume()
        Log.d(VERSE_LOG_TAG, thirdPartVerse)
    }

    override fun onPause() {
        super.onPause()
        Log.d(VERSE_LOG_TAG, quarterPartVerse)
    }

    override fun onStop() {
        super.onStop()
        Log.d(VERSE_LOG_TAG, fifthPartVerse)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(VERSE_LOG_TAG, firstPartVerse + secondPartVerse)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(VERSE_LOG_TAG, sixthPartVerse)
    }


}