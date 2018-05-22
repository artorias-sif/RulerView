![](https://img.shields.io/github/release/1169458576/RulerView.svg)
[![](https://img.shields.io/hexpm/l/plug.svg)](https://www.apache.org/licenses/LICENSE-2.0)
![](https://img.shields.io/jitpack/v/1169458576/RulerView.svg)

RulerView
===
Android自定义刻度尺控件</br>
<img width="270" height="480" src="/img/screenshot.gif"/>
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
    compile 'com.github.1169458576:RulerView:v1.0.3'
    
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

| 参数 | 说明 | 默认值 |
| :------------: | :-------------: | :------------: |
| perWidth | 每个刻度间隔距离 | 5dp |
| minValue | 最小值 | 0 |
| maxValue | 最大值 | 100 |
| spacingValue | 每个刻度代表的值 | 1 |
| shortHeight | 短刻度高度 | 5dp |
| longHeight | 长刻度高度 | 10dp |
| middleHeight | 中线高度 | 15dp |
| lineWidth | 刻度线宽 | 1dp |
| textSize | 文字大小 | 12dp |
| lineColor | 刻度线颜色 | GRAY |
| middleLineColor | 中线颜色 | RED |
| textColor | 文字颜色 | GRAY |
| middleLineWidth | 中线宽度 | 1dp |
| textMargin | 文字与长刻度间距 | 10dp |
| longSpacingValue | 长刻度间隔刻度值 | 10 |
| showBaseLine | 是否显示底线 | 否 |

| 方法 | 说明 |
| :----: | :----: |
| scrollToValue(int value) | 滚动到 value(在minValue~maxValue范围内且能被spacingValue整除) |
