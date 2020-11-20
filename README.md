# TToastUtil
自定义Toast

用法：

1、添加依赖implementation 'com.github.TenzLiu:TToastUtil:1.0.0'

2、使用，可以使用withMethod()设置多个属性
TToast.newInstance(MainActivity.this).show("this is a toast");//默认
TToast.newInstance(MainActivity.this).withBgColor(R.color.colorAccent).show("this is a toast");//设置背景颜色
TToast.newInstance(MainActivity.this).withTextColor(R.color.colorPrimary).show("this is a toast");//设置字体颜色
TToast.newInstance(MainActivity.this).withDuration(Toast.LENGTH_SHORT).show("this is a toast");//设置时间
TToast.newInstance(MainActivity.this).withGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM).withYOffset(100).show("this is a toast");//设置位置
