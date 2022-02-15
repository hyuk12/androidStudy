# androidStudy
# 2일차 내용 복습

***
* Layout 의 종류
  *  상대 레이아웃(RelativeLayout)
  *  FrameLayout
* 간단한 앱 화면 출력해보기
***

```
상대 레이아웃 이란?
1. 상대 레이아웃 부모 뷰 기준으로 정렬 하는것 : parent
2. 상대 레이아웃 부모 뷰 기준으로 중앙 정렬 하는것 : center


<RelativeLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

    <TextView
            android:layout_centerInParent="true"
            android:background="@color/purple_200"
            android:layout_width="50dp"
            android:layout_height="50dp"/>

    
    <TextView
            android:layout_centerHorizontal="true"
            android:layout_alignParentBottom="true"
            android:background="@color/black"
            android:layout_width="50dp"
            android:layout_height="50dp"/>

</RelativeLayout>
```

```
 상대 레이아웃 에서 특정 뷰 기준으로 배치 하는 방법은
 to_ , of 가 들어가는 속성을 사용하면 된다.
 
 이때 html 에서 처럼 식별자용 ID를 써야한다.
 
 <RelativeLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

    <!-- 식별자 id   -->
    <TextView
            android:id="@+id/view1"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:background="@color/purple_200"
            android:layout_centerInParent="true"/>

    <TextView
            android:layout_toLeftOf="@id/view1"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:background="@color/teal_200"
            android:layout_centerInParent="true"/>
```

***
FrameLayout 을 이용 하는 경우!
LinearLayout 은 안의 뷰컴포넌트 끼리 합치는 것이 불가능 하다.
</br>하지만 이를 써야 되고 곂치고 싶을 때 frameLayout을 이용한다
***
