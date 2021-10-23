# MaterialDesign
material design library for codenameone. this library used as style helper it reduse time and code.
this library also used lineicon icons to create brand icons like facebook,google,apple,etc.

### using MStyle class

```java
     Label mylabel = new Label();
     MStyle style = new MStyle(mylabel);
     style.fgColor(MaterialColor.BLACK).bgColor(MaterialColor.WHITE).padding(2).margin(2).roundRectBorder();
```
OR just use new instance 
```java
     Label mylabel = new Label();
     new MStyle(mylabel).fgColor(MaterialColor.BLACK).bgColor(MaterialColor.WHITE).padding(2).margin(2).roundRectBorder();
```
