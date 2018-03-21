![](https://img.shields.io/github/release/1169458576/RulerView.svg) ![](https://img.shields.io/hexpm/l/plug.svg)

RulerView
===
Android自定义刻度尺控件</br>
<img width="540" height="960" src="/img/screenshot.png"/>
## 引用
在根目录下的build.gradle中添加
```gradle
 allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
        }
    }
```
在项目目录下的build.gradle中添加
```gradle
   dependencies {
    ...
    compile 'com.github.1169458576:RulerView:v1.0.2'
    
    }
```
## 示例
xml
```XML
    <com.zhzh.rulerlib.RulerView
            android:id="@+id/rulerView"
            android:layout_width="match_parent"
            android:layout_height="50dp"
            android:layout_marginRight="16dp"
            android:layout_marginLeft="16dp"
            app:perWidth="10dp"
            app:minValue="0"
            app:maxValue="100"
            app:spacingValue="1"
            app:longSpacingValue="10"
            app:shortHeight="10dp"
            app:longHeight="15dp"
            app:middleHeight="20dp"
            app:lineWidth="1dp"
            app:middleLineWidth="1dp"
            app:middleLineColor="@android:color/holo_red_light"
            app:lineColor="@android:color/darker_gray"
            app:textSize="12sp"
            app:textMargin="10dp"
            app:showBaseLine="false"
            />
```
java
```java
    rulerView=(RulerView) findViewById(R.id.rulerView);
    rulerView.setOnValueChangedListener(new RulerView.OnValueChangedListener() {
        @Override
        public void onValueChanged(int value) {
               txt.setText(String.valueOf(value));
            }
        });
    rulerView.scrollToValue(90);
```
## 说明

| 参数 | 说明 |
| :------------: | :-------------: |
| perWidth | 每个刻度间隔距离 |
| minValue | 最小值 |
| maxValue | 最大值 |
| spacingValue | 每个刻度代表的值 |
| shortHeight | 短刻度高度 |
| longHeight | 长刻度高度 |
| middleHeight | 中线高度 |
| lineWidth | 刻度线宽 |
| textSize | 文字大小 |
| lineColor | 刻度线颜色 |
| middleLineColor | 中线颜色 |
| textColor | 文字颜色 |
| middleLineWidth | 中线宽度 |
| textMargin | 文字与长刻度间距 |
| longSpacingValue | 长刻度间隔刻度值 |
| showBaseLine | 是否显示底线 |

| 方法 | 说明 |
| :----: | :----: |
| scrollToValue(int value) | 滚动到 value(在minValue~maValue范围内且能被spacingValue整除) |
