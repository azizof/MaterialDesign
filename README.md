# MaterialDesign
material design library for codenameone. this library used as style helper it reduse time and code.
this library also used lineicon icons to create brand icons like facebook,google,apple,etc.

 - [MStyle](https://github.com/azizof/MaterialDesign/blob/master/README.md#MButton)
 - [MToast](https://github.com/azizof/MaterialDesign/blob/master/README.md#MToast)
 - [MDialog](https://github.com/azizof/MaterialDesign/blob/master/README.md#MDialog)
 - [MCheckbox](https://github.com/azizof/MaterialDesign/blob/master/README.md#MCheckbox)
 - [Example of MRadioButton,Card and icons](https://github.com/azizof/MaterialDesign/blob/master/README.md#example-of-using-mradiobuttoncard-and-icons)




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

       hi.addAll(button, success, error, textOnly, FlowLayout.encloseRight(textOnlyUnderline));
       hi.add(MButton.outline("outline", 0xff0000).action(l -> System.out.println("out line chaining call method")));

        hi.show();
```
the output of the code will be :
<br/>
<img src ="https://github.com/azizof/MaterialDesign/blob/master/images/Mbutton.png" width=50% hight=50% />

### MToast

show styled toast 

#### Custom 
```java
            MToast toast = new MToast("Hello World",2000);
            toast.style().bgColor("#573f94").fgColor("ffffff").roundBorder(2,0xddd8e9);
            toast.show();
```
<img src ="https://github.com/azizof/MaterialDesign/blob/master/images/Mtoast.png" width=50% hight=50% />

#### Info
```java
         MToast.showInfo("data saved");
```
<img src ="https://github.com/azizof/MaterialDesign/blob/master/images/infoToast.png" width=50% hight=50% />

#### Success
```java
         MToast.showSuccess("file uploaded successfully");
```
<img src ="https://github.com/azizof/MaterialDesign/blob/master/images/successToast.png" width=50% hight=50% />

#### Error
```java
     MToast.showError("Some error ")
```
<img src ="https://github.com/azizof/MaterialDesign/blob/master/images/errorToast.png" width=50% hight=50% />

#### Warning
```java
         MToast.showWarning("this is warning");
```
<img src ="https://github.com/azizof/MaterialDesign/blob/master/images/warningToast.png" width=50% hight=50% />

### MDialog
styled dialog with 
#### Custom
```java
            MDialog dialog = new MDialog();
            dialog.style().fgColor(0x4E3885);
            dialog.title("Check your love ")
                    .body("Do you like this library? \n there is no choice :)")
                    .confirmButton("Yes", MaterialIcons.createFontImageIcon(FontImage.MATERIAL_FAVORITE,0xff0000))
                    .confirmButtonColors(0x573F94,0xeeebf4)
                    .onConfirm(al-> System.out.println("Confirmed "));
            dialog.show();
```
<img src ="https://github.com/azizof/MaterialDesign/blob/master/images/Mdialog.png" width=50% hight=50% />

#### Confirm
```java
    MDialog.createConfirm("Check your love",
                    "Do you like this library? \n there is no choice :)",
                    "Yes",
                    null)
                    .onConfirm(al -> System.out.println("confirmed"))
                    .show();
```
<img src ="https://github.com/azizof/MaterialDesign/blob/master/images/confirmDialog.png" width=50% hight=50% />

#### Danger
```java
     MDialog.createDanger("Delete File",
                    "Are you sure you want to delete this file ? ",
                    "Yes",
                    "No")
                    .onConfirm(al -> System.out.println("confirmed"))
                    .onCancel(al -> System.out.println("Canceled"))
                    .show();
```
<img src ="https://github.com/azizof/MaterialDesign/blob/master/images/dangerDialog.png" width=50% hight=50% />

### MCheckbox

styled check box

```java
    
        Form hi = new Form("MCheckBox");
        MCheckBox checkBox = new MCheckBox("Check Box");
        checkBox.style().paddingTop(2).marginTop(2).fontBold();

        hi.add(checkBox);
        hi.add(new MCheckBox("Check box").select().dataChangeListener(al -> {
            System.out.println("data changed");
        }));
        hi.show();
```

#### to chenge the color of the select check box :
 - first param the color of the check box (default primery) 
 - second param make the checkbox  round

the changes will apply to **ALL CHECKBOXES**
          

```java
         
        MCheckBox.setCheckBoxesDesign(0xff0000, false);
```


### example of using MRadioButton,card and icons


```java
        Form hi = new Form("MRadio,Card,icons", BoxLayout.y());
        
        Card socialMediaCard = new Card();
        socialMediaCard.add(new Label("Select Social Media"));
        MRadioButton facebook = new MRadioButton("Facebook",
                MaterialIcons.createIcon(MaterialIcons.Brand.FACEBOOK_ORIGINAL,0x3b5998));

        MRadioButton twitter = new MRadioButton("Twitter",
                MaterialIcons.createIcon(MaterialIcons.Brand.TWITTER_ORIGINAL,0x1DA1F2));

        new ButtonGroup(facebook,twitter);
        socialMediaCard.addAll(facebook,twitter);

        Card languageCard= new Card();
        languageCard.style().bgColor(MaterialColor.getRandomLightColor());
        SpanLabel langQuestion = new SpanLabel("which of this language used in Codename one?");
        new MStyle(langQuestion.getTextComponent())
                .marginBottom(3)
                .marginTop(2)
                .marginLeft(2)
                .marginRight(2)
                .padding(3,2);


        MRadioButton java = new MRadioButton("Java",
                MaterialIcons.createIcon(MaterialIcons.Brand.JAVA,0xed1d25));

        MRadioButton javascript = new MRadioButton("Javascript",
                MaterialIcons.createIcon(MaterialIcons.Brand.JAVASCRIPT,0xf0db4f));

        MRadioButton python = new MRadioButton("Python",
                MaterialIcons.createIcon(MaterialIcons.Brand.PYTHON,0x1DA1F2));

        MRadioButton php = new MRadioButton("PHP",
                MaterialIcons.createIcon(MaterialIcons.Brand.PHP,0x8993be,5));

        new ButtonGroup(java,javascript,python,php);
        languageCard.addAll(langQuestion,java,javascript,python,php);

        hi.add(socialMediaCard);
        hi.add(languageCard);
        hi.show();         

```

