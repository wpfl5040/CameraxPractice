# CameraX 라이브러리
CameraX는 카메라 앱 개발을 더 쉽게 할 수 있도록 만들어진 Jetpack 지원 라이브러리

## CarmerX 구조
- 이미지 미리보기: PreviewView 같은 미리보기를 표시할 영역을 허용합니다.
- 이미지 분석: 머신러닝 등의 분석을 위해 CPU에서 액세스할 수 있는 버퍼를 제공합니다.
- 이미지 캡처: 사진을 캡처하고 저장합니다.

## set up
- CameraX에는 Java 8의 일부인 몇 가지 메서드가 필요하므로 그에 따라 컴파일 옵션을 설정해야합니다.
```
compileOptions {
    sourceCompatibility JavaVersion.VERSION_1_8
    targetCompatibility JavaVersion.VERSION_1_8
}
```
- app gradle
```
def camerax_version = "1.0.0-beta07"
// CameraX core library using camera2 implementation
implementation "androidx.camera:camera-camera2:$camerax_version"
// CameraX Lifecycle Library
implementation "androidx.camera:camera-lifecycle:$camerax_version"
// CameraX View class
implementation "androidx.camera:camera-view:1.0.0-alpha14"
```
- 퍼미션
```
// 카메라가 있는지 확인
<uses-feature android:name="android.hardware.camera.any" />
// 카메라 퍼미션
<uses-permission android:name="android.permission.CAMERA" />
```

## 이미지 미리보기 
```
<androidx.camera.view.PreviewView
  ...   />
```
- layout에 previewView로 카메라를 보이게 할수 있음

## 이미지 캡처



## 참고자료
- https://developer.android.com/training/camerax
- https://codelabs.developers.google.com/codelabs/camerax-getting-started/#0
- 

