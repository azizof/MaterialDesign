# MaterialDesign
material design library for codenameone. this library used as style helper it reduse time and code.
this library also used lineicon icons to create brand icons like facebook,google,apple,etc.

### MStyle
this class used as style helper and used by each compontent in materialdesign.ui package. for calling it just use **style()** method 
```java
     Label mylabel = new Label();
     MStyle style = new MStyle(mylabel);
     style.fgColor(MaterialColor.BLACK).bgColor(MaterialColor.WHITE).padding(2).margin(2).roundRectBorder();
```
OR just use new instance 
```java
     Label mylabel = new Label();
     new MStyle(mylabel).fgColor(MaterialColor.BLACK).bgColor(MaterialColor.WHITE).padding(2).margin(2)
          .roundRectBorder(2,MaterialColor.PRIMARY,1,false);
```

### MButton
```java
       Form hi = new Form("MButton", BoxLayout.y());

       MButton button = new MButton("Hello World");
       button.style().bgColor(MaterialColor.BLACK).fgColor(MaterialColor.WHITE)
               .padding(2).margin(1).roundBorder();

       MButton success = MButton.success("Success");
       success.setMaterialIcon(FontImage.MATERIAL_DONE_OUTLINE);
       success.action(al -> System.out.println("success"));

       MButton error = MButton.error("Error").action(al -> System.out.println("Error"));

       MButton textOnly = MButton.textOnly("Text Only", MaterialColor.PRIMARY_DARK, false);

       MButton textOnlyUnderline = MButton.textOnly("Underline text", MaterialColor.PRIMARY_DARK, true);

       hi.addAll(button, success, error, textOnly, FlowLayout.encloseRight(textOnlyUnderline), MButton.outline("outline", 0xff0000)
                .action(l -> System.out.println("out line chaining call method")));

        hi.show();
```
the output of the code will be :

![alt text](https://github.com/azizof/MaterialDesign/blob/master/images/Mbutton.png "MButton example")
