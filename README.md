# TToastUtil
自定义Toast\r\n
用法：\r\n
1、添加依赖implementation 'com.github.TenzLiu:TToastUtil:1.0.0'\r\n
2、使用，可以使用withMethod()设置多个属性\r\n
TToast.newInstance(MainActivity.this).show("this is a toast");//默认\r\n
TToast.newInstance(MainActivity.this).withBgColor(R.color.colorAccent).show("this is a toast");//设置背景颜色\r\n
TToast.newInstance(MainActivity.this).withTextColor(R.color.colorPrimary).show("this is a toast");//设置字体颜色\r\n
TToast.newInstance(MainActivity.this).withDuration(Toast.LENGTH_SHORT).show("this is a toast");//设置时间\r\n
TToast.newInstance(MainActivity.this).withGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM).withYOffset(100).show("this is a toast");//设置位置\r\n
