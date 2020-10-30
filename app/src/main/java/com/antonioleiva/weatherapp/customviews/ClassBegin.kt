package com.antonioleiva.weatherapp.customviews

/*class ClassBegin : LinearLayout {
    private fun inits() {
        /*iniText()
        iniListeners(R.layout.activity_main_begin,intent = )*/
        bt_change_screan.apply {
            text = resources.getString(R.string.info_week)

            setOnClickListener {

                //val intent = Intent(this@MainActivityBegin, MainActivity2::class.java)
                //startActivity(intent)
            }
        }

    }

    private fun Listener(activityBegin: MainActivityBegin, activity2: MainActivity2) {
        //val intent = Intent(MainActivityBegin::class.java, MainActivity2::class.java)
        //startActivity(intent)
    }

    private fun iniListeners(CurrentActivity: Activity, intent: Intent) {
        bt_change_screan.setOnClickListener {
            val intent = Intent(CurrentActivity, MainActivity::class.java)
            intent.putExtra(MainActivityBegin.PARAM, "Pol")
            CurrentActivity.finish()
        }

    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private fun iniText(text: String, text2: String) {

        val text = R.string.info_week.toString()
        bt_change_screan.text = text

        val text2 = R.string.week_1.toString()
        tv_week1.text = text2

    }
}*/
/*
class ButtonWithLoaderLayout : LinearLayout {
    private var mTvButton: TextView? = null
    private var mDlLoader: DotsLoader? = null
    private var mText: String? = null

    constructor(context: Context?) : super(context) {
        initLayout()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {
        initLayout()
    }

    private fun initLayout() {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.button_with_loader_layout, this, true)
        bindViews()
    }

    private fun bindViews() {
        mTvButton = findViewById(R.id.tv_button_text)
        mDlLoader = findViewById(R.id.dl_loader)
    }

    fun setText(text: String?) {
        mTvButton!!.text = text
        mText = text
    }

    fun setText(text: Int) {
        mTvButton!!.setText(text)
        mText = mTvButton!!.text.toString()
    }

    fun showLoader() {
        mDlLoader.setVisibility(View.VISIBLE)
        mDlLoader.show()
        mTvButton!!.text = ""
    }

    fun hideLoader() {
        mDlLoader.hide()
        mTvButton!!.text = mText
        mTvButton!!.visibility = View.VISIBLE
    }
}
*/