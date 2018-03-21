RulerView
===
Android自定义刻度尺控件</br>
<img width="500" height="1000" src="/img/screenshot.png"/>
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
    compile 'com.github.1169458576:RulerView:v1.0.0'
    
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
