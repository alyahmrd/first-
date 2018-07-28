

package Project;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import static javafx.scene.layout.AnchorPane.setLeftAnchor;
import static javafx.scene.layout.AnchorPane.setRightAnchor;
import static javafx.scene.layout.AnchorPane.setTopAnchor;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;



public class Project extends Application  {


    Stage s;
    Stage s1;
    Scene  s2, s3, s4, s5, s6, s7, s8;
     private TextField tfCount;
     private TextField tfCount1;
     private TextField tfCount2;
     private TextField tfCount3;
   private Button btnCount;
   private Button btnCount1;
   private Button btnCount2;
   private Button btnCount3;
   private Button btnsub;
   private Button btnsub1;
   private Button btnsub2;
   private Button btnsub3;
   private int count = 0;
   private int count1 = 0;
   private int count2 = 0;
   private int count3 = 0;
   private TextField tfCount7;
     private TextField tfCount6;
     private TextField tfCount5;
     private TextField tfCount4;
    private Button btnCount7;
   private Button btnCount6;
   private Button btnCount5;
   private Button btnCount4;
   private Button btnsub7;
   private Button btnsub6;
   private Button btnsub5;
   private Button btnsub4;
   private int count7 = 0;
   private int count6 = 0;
   private int count5 = 0;
   private int count4 = 0;
   
    public  AnchorPane Home(){
    
        AnchorPane pane2 = new AnchorPane();
         pane2.setStyle("-fx-background-color: #282828;");
          Scene scene = new Scene(pane2,1000,500);
          
         s.setScene(scene);
            s.setTitle("Home");
            s.show();
        
       
        Image image= new Image("Images/black-logo.png");
   ImageView imageView1 = new ImageView(image); 
    imageView1.setFitHeight(500); 
       imageView1.setFitWidth(1000);
            pane2.getChildren().add(imageView1); 
             DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(3.0);
        ds.setColor(Color.GRAY);
                
         Label cafeteria = new Label("Cafeteria System");
     cafeteria.setStyle("-fx-text-Fill: yellow");
     cafeteria.setFont(Font.font("Arial", FontWeight.BOLD, 50));
    cafeteria.setCache(true);
        cafeteria.setEffect(ds);
      pane2.getChildren().add(cafeteria);
      
    Button man = new Button();
    man.setText("Manager");
         man.setStyle("-fx-background-color: #E8E8E8;");
                     man.setCache(true);
                      man.setEffect(ds);
                      man.setPrefWidth(200.0);
                        man.setOnAction((ActionEvent e) -> 
                            Manager());
                        
    Button sal = new Button("Salesman");
             sal.setStyle("-fx-background-color: #E8E8E8;");
                     sal.setCache(true);
                         sal.setEffect(ds);
                              sal.setPrefWidth(200.0);
                                    sal.setOnAction((ActionEvent e) -> {
                                        Salesman();
        });
           
    Button cust = new Button("Customer");
                 cust.setStyle("-fx-background-color: #E8E8E8;");
                     cust.setCache(true);
                      cust.setEffect(ds);
                          cust.setPrefWidth(200.0);
                            cust.setOnAction((ActionEvent e) -> {
                                Customer();
        });
                     
                      
    setTopAnchor(man, 200.0);
        setRightAnchor(man, 400.0);
    
    setTopAnchor(sal, 250.0);
        setRightAnchor(sal, 400.0);
    setTopAnchor(cust, 300.0);
        setRightAnchor(cust, 400.0);
    setTopAnchor(cafeteria, 50.0);
        setRightAnchor(cafeteria, 300.0);
     
     pane2.getChildren().addAll(man, sal, cust);

        
        
    return pane2;
    } 
    
    public Pane Registeration(){
    Pane pane = new Pane();
    
            

     pane.setStyle("-fx-background-color: #282828;");
     Image image= new Image("Images/black-logo.png");
   ImageView imageView1 = new ImageView(image); 
    imageView1.setFitHeight(500); 
       imageView1.setFitWidth(1000);
            pane.getChildren().add(imageView1);
          
   
     
    DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(3.0);
        ds.setColor(Color.GRAY);
    
    Button login = new Button("Log In");

    login.setStyle("-fx-background-color: #E8E8E8; ");
    login.setCache(true);
        login.setEffect(ds);
               login.setOnAction((ActionEvent e) -> {
                            Customer();
        }); 
             
    
    Label cafeteria = new Label("Cafeteria System");
     cafeteria.setStyle("-fx-text-Fill: yellow");
     cafeteria.setFont(Font.font("Arial", FontWeight.BOLD, 50));
      cafeteria.setCache(true);
        cafeteria.setEffect(ds);
    
    Label log = new Label("LOG IN");
    log.setStyle("-fx-text-Fill: white");
     log.setFont(Font.font("Arial", FontWeight.BOLD, 25));
    
    Label reg = new Label("REGISTERATION");
    reg.setStyle("-fx-text-Fill: white");
     reg.setFont(Font.font("Arial", FontWeight.BOLD, 25));
    
      Label use = new Label("User Name :");
       use.setStyle("-fx-text-Fill: white");
     use.setFont(Font.font("Arial", FontWeight.BOLD, 12));
      
      Label pass = new Label("Password :");
      pass.setStyle("-fx-text-Fill: white");
     pass.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     
      Label first = new Label("First Name :");
      first.setStyle("-fx-text-Fill: white");
     first.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     
      Label last = new Label("Last Name :");
      last.setStyle("-fx-text-Fill: white");
     last.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     
      Label pss = new Label("New Password :");
      pss.setStyle("-fx-text-Fill: white");
     pss.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     
     
     
      Button regi = new Button("Register");
         
      regi.setStyle("-fx-background-color: #E8E8E8; ");
    regi.setCache(true);
        regi.setEffect(ds);
          regi.setOnAction((ActionEvent e) -> {
                            Home();
        }); 
     
      TextField us = new TextField();
       PasswordField ps = new PasswordField();
        ps.setPromptText("Enter Your Password");
        us.setPromptText("Enter Your Username");
        TextField fs = new TextField();
       TextField ls = new TextField();
        fs.setPromptText("Ex:Jack");
        PasswordField pas = new PasswordField();
        
        
        
        pas.setLayoutX(650);
    pas.setLayoutY(300);
    
         fs.setLayoutX(630);
    fs.setLayoutY(200);
    
      ls.setLayoutX(630);
    ls.setLayoutY(250);
        
        
        ps.setLayoutX(130);
    ps.setLayoutY(250);
      
     us.setLayoutX(130);
    us.setLayoutY(200);
      
      regi.setLayoutX(605);
    regi.setLayoutY(350);
    
      first.setLayoutX(550);
    first.setLayoutY(200);
    
      last.setLayoutX(550);
    last.setLayoutY(250);
      
      pss.setLayoutX(550);
    pss.setLayoutY(300);
    
     
    
      pass.setLayoutX(50);
    pass.setLayoutY(250);
    
     use.setLayoutX(50);
    use.setLayoutY(200);
    
     reg.setLayoutX(550);
    reg.setLayoutY(150);
    
    log.setLayoutX(50);
    log.setLayoutY(150);
    
    cafeteria.setLayoutX(250);
    cafeteria.setLayoutY(50);
    
    login.setLayoutX(100);
    login.setLayoutY(300);
    
    pane.getChildren().addAll(login, cafeteria, log, reg, use, pass, first, last, pss, regi, us, ps, fs, ls, pas);
    
    
   
  
    
    
    return pane;
    }
      
    public AnchorPane  Customer(){
       AnchorPane pane3 = new AnchorPane();
        Scene scene = new Scene(pane3,1000,500);
          
         s.setScene(scene);
            s.setTitle("CUSTOMER");
            s.show();
            
      
            
        pane3.setStyle("-fx-background-color: #282828;");
       s.setTitle("Customer Screen");
        Image image= new Image("Images/black-logo.png");
   ImageView imageView1 = new ImageView(image); 
    imageView1.setFitHeight(500); 
       imageView1.setFitWidth(1000);
            pane3.getChildren().add(imageView1); 
                DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(3.0);
        ds.setColor(Color.GRAY);
        
         Label cafeteria = new Label("CUSTOMER ACCOUNT");
     cafeteria.setStyle("-fx-text-Fill: yellow");
     cafeteria.setFont(Font.font("Arial", FontWeight.BOLD, 50));
     cafeteria.setCache(true);
        cafeteria.setEffect(ds);
        
     
        Button shop = new Button("ORDER");
                setTopAnchor(shop, 150.0);
                    setRightAnchor(shop, 450.0);
                        shop.setStyle("-fx-background-color: #E8E8E8;");
                            shop.setCache(true);
                                shop.setEffect(ds);
                                    shop.setPrefWidth(100.0);
        
    
             Label drinks = new Label("DRINKS");
       drinks.setStyle("-fx-text-Fill: white");
     drinks.setFont(Font.font("Arial", FontWeight.BOLD, 25));
     drinks.setCache(true);
        drinks.setEffect(ds);
     Line line = new Line();
        line.setStartX(500.0f);
            line.setStartY(200.0f);
                line.setEndX(500.0f);
                    line.setEndY(450.0f);
                    line.setStroke(Color.WHITE);
                    line.setStrokeWidth(5);
        
        
          Label food = new Label("FOOD");
        food.setStyle("-fx-text-Fill: white");
     food.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        food.setCache(true);
        food.setEffect(ds);
    
        
         Label quantity = new Label("quantity");
        quantity.setStyle("-fx-text-Fill: white");
     quantity.setFont(Font.font("Arial", FontWeight.BOLD, 14));
     Label quantity1 = new Label("quantity");
        quantity1.setStyle("-fx-text-Fill: white");
     quantity1.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        
        
        
        
        
        ComboBox comboBox = new ComboBox();
           ComboBox comboBox1 = new ComboBox();
            ComboBox comboBox2 = new ComboBox();
                ComboBox comboBox3 = new ComboBox();
        
        
        Label hotdrinks = new Label("Hot Drinks :");
       hotdrinks.setStyle("-fx-text-Fill: white");
     hotdrinks.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     comboBox3.getItems().addAll( "Nescafe", "Coffe", "Tea");
     comboBox3.setPromptText("hot drinks");
     TextField price3 = new TextField("5");
                price3.setEditable(false);
                    price3.setPrefWidth(30.0);
                    
        Label cost1 = new Label("Price");
      cost1.setStyle("-fx-text-Fill: white");
     cost1.setFont(Font.font("Arial", FontWeight.BOLD, 14));
     Label cost = new Label("Price");
      cost.setStyle("-fx-text-Fill: white");
     cost.setFont(Font.font("Arial", FontWeight.BOLD, 14));
     
     
      Label colddrinks = new Label("Cold Drinks :");
      colddrinks.setStyle("-fx-text-Fill: white");
     colddrinks.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     comboBox2.getItems().addAll( "Pepsi", "Fayrouz", "RedBull", "Mango");
     comboBox2.setPromptText("cold drinks");
     TextField price4 = new TextField("5");
                price4.setEditable(false);
                    price4.setPrefWidth(30.0);
        
      Label sandwichs = new Label("Sandwichs :");
      sandwichs.setStyle("-fx-text-Fill: white");
     sandwichs.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     comboBox1.getItems().addAll( "شاورما", "بانية", "تونة");
     comboBox1.setPromptText("Sandwichs");
        TextField price1 = new TextField("15");
            price1.setEditable(false);
                price1.setPrefWidth(30.0);
     
     
      Label biscuts = new Label("Biscuts :");
        biscuts.setStyle("-fx-text-Fill: white");
            biscuts.setFont(Font.font("Arial", FontWeight.BOLD, 12));  
            comboBox.getItems().addAll( "Oreo", "Borio", "Ulker");
            comboBox.setPromptText("Biscuts"); 
            TextField price2 = new TextField("2");
                price2.setEditable(false);
                    price2.setPrefWidth(30.0);
        
        
        
          
         
                      
                 Button sett = new Button("Setting");
                     sett.setStyle("-fx-background-color: #E8E8E8;");
                     sett.setCache(true);
                      sett.setEffect(ds);
                      sett.setPrefWidth(100.0);
                          sett.setOnAction((ActionEvent e) -> {
                            Settings();
        }); 
                      
                      
                     Button feed = new Button("Feedback");
                         feed.setStyle("-fx-background-color: #E8E8E8;");
                     feed.setCache(true);
                      feed.setEffect(ds);
                      feed.setPrefWidth(100.0);
                      feed.setOnAction((ActionEvent e) -> {
                            Feedback();
        }); 
                      
                      
                         Button logout = new Button("Log Out");
                            logout.setOnAction((ActionEvent e) -> {
                             Scene s1 =new Scene(Registeration(),1000,500);
                             s.setScene(s1);
                             s.show();
        }); 
                        
                                                 
                        logout.setStyle("-fx-background-color: #E8E8E8;");
                     logout.setCache(true);
                      logout.setEffect(ds);
                      logout.setPrefWidth(100.0);
                      
                      
        Button confirm = new Button("Total");
                         confirm.setStyle("-fx-background-color: #E8E8E8;");
                     confirm.setCache(true);
                      confirm.setEffect(ds);
                      confirm.setPrefWidth(100.0);    
       TextField  result = new TextField();
       result.setPromptText("your total cash");
      result.setEditable(false);
       result.setPrefWidth(75.0);
          confirm.setOnAction(e -> {
            Integer value1 = Integer.valueOf(price1.getText());
            Integer value2 = Integer.valueOf(price2.getText());
            Integer value3 = Integer.valueOf(tfCount5.getText());
            Integer value4 = Integer.valueOf(tfCount4.getText());
            Integer value5 = Integer.valueOf(price3.getText());
            Integer value6 = Integer.valueOf(price4.getText());
            Integer value7 = Integer.valueOf(tfCount6.getText());
            Integer value8 = Integer.valueOf(tfCount7.getText());
            Integer r = (value1*value3) + (value2*value4)+ (value5*value7)+ (value6*value8);
            result.setText(r.toString());
        });  
                      
          
                      
                      
                      tfCount4 = new TextField("0");
      tfCount4.setEditable(false);
       tfCount4.setPrefWidth(30.0);
          btnCount4 = new Button("Add");
             btnCount4.setOnAction(evt -> tfCount4.setText(++count4 + ""));
                btnsub4 = new Button("Sub.");
                    btnsub4.setOnAction(e -> tfCount4.setText(--count4 + ""));
            
      
      tfCount5 = new TextField("0");
      tfCount5.setEditable(false);
       tfCount5.setPrefWidth(30.0);
      btnCount5 = new Button("Add");
      btnCount5.setOnAction(e -> tfCount5.setText(++count5 + ""));
        btnsub5 = new Button("Sub.");
                    btnsub5.setOnAction(e -> tfCount5.setText(--count5 + ""));

      tfCount6 = new TextField("0");
      tfCount6.setEditable(false);
       tfCount6.setPrefWidth(30.0);
      btnCount6 = new Button("Add");
      btnCount6.setOnAction(e -> tfCount6.setText(++count6 + ""));
      btnsub6 = new Button("Sub.");
                    btnsub6.setOnAction(e -> tfCount6.setText(--count6 + ""));
        
      
      tfCount7 = new TextField("0");
      tfCount7.setEditable(false);
       tfCount7.setPrefWidth(30.0);
      btnCount7 = new Button("Add");
      btnCount7.setOnAction(e -> tfCount7.setText(++count7 + ""));
      btnsub7 = new Button("Sub.");
                    btnsub7.setOnAction(e -> tfCount7.setText(--count7 + ""));
                      
                      
                      
                      
                      
             
              
    setTopAnchor(hotdrinks, 300.0);
        setRightAnchor(hotdrinks, 400.0);
     setTopAnchor(comboBox3, 300.0);
        setRightAnchor(comboBox3, 280.0);  
        setTopAnchor(btnCount7, 300.0);
        setRightAnchor(btnCount7, 100.0);
    setTopAnchor(tfCount7, 300.0);
        setRightAnchor(tfCount7, 180.0);
     setTopAnchor(btnsub7, 300.0);
        setRightAnchor(btnsub7, 50.0);   
        setTopAnchor(price4, 300.0);
        setRightAnchor(price4, 230.0);
        
        
  setTopAnchor(colddrinks, 250.0);
        setRightAnchor(colddrinks, 400.0);
     setTopAnchor(comboBox2, 250.0);
        setRightAnchor(comboBox2, 280.0);
        setTopAnchor(btnCount6, 250.0);
        setRightAnchor(btnCount6, 100.0);
    setTopAnchor(tfCount6, 250.0);
        setRightAnchor(tfCount6, 180.0);
    setTopAnchor(btnsub6, 250.0);
        setRightAnchor(btnsub6, 50.0); 
        setTopAnchor(price3, 250.0);
        setRightAnchor(price3, 230.0);
        
        
   setTopAnchor(sandwichs, 250.0);
        setLeftAnchor(sandwichs, 50.0);
    setTopAnchor(comboBox1, 250.0);
        setLeftAnchor(comboBox1, 150.0);
    setTopAnchor(quantity1, 200.0);
        setRightAnchor(quantity1, 170.0);
        setTopAnchor(tfCount5, 250.0);
        setLeftAnchor(tfCount5, 310.0);
    setTopAnchor(btnCount5, 250.0);
        setLeftAnchor(btnCount5, 380.0); 
    setTopAnchor(btnsub5, 250.0);
        setLeftAnchor(btnsub5, 450.0); 
        setTopAnchor(price1, 250.0);
        setLeftAnchor(price1, 250.0);
        
  setTopAnchor(biscuts, 300.0);
        setLeftAnchor(biscuts, 50.0);
    setTopAnchor(comboBox, 300.0);
        setLeftAnchor(comboBox, 130.0);
         setTopAnchor(tfCount4, 300.0);
        setLeftAnchor(tfCount4, 310.0);
    setTopAnchor(btnCount4, 300.0);
        setLeftAnchor(btnCount4, 380.0);
    setTopAnchor(btnsub4, 300.0);
        setLeftAnchor(btnsub4, 450.0);
        setTopAnchor(price2, 300.0);
        setLeftAnchor(price2, 250.0);
      
        setTopAnchor(cost1, 200.0);
        setLeftAnchor(cost1, 250.0);
        setTopAnchor(cost, 200.0);
        setRightAnchor(cost, 230.0);
    setTopAnchor(result,420.0);
        setRightAnchor(result, 750.0);    
    setTopAnchor(confirm,450.0);
        setRightAnchor(confirm, 750.0);    
    setTopAnchor(quantity, 200.0);
        setLeftAnchor(quantity, 300.0);
    setTopAnchor(food, 150.0);
        setLeftAnchor(food, 100.0);
    setTopAnchor(drinks, 150.0);
        setRightAnchor(drinks, 150.0);
    setTopAnchor(cafeteria, 50.0);
        setRightAnchor(cafeteria, 250.0);
       setTopAnchor(sett,450.0);
        setRightAnchor(sett, 600.0);
    setTopAnchor(feed,450.0);
        setRightAnchor(feed, 450.0);
        setTopAnchor(logout,450.0);
        setRightAnchor(logout, 300.0);
         
        
      pane3.getChildren().addAll( shop, cost1, cost, price4, price3, price2, price1, result, confirm, btnsub4, btnsub5, btnsub6, btnsub7, btnCount4, btnCount5, btnCount6, btnCount7, tfCount4, tfCount5, tfCount6, tfCount7, quantity1, quantity, biscuts, sandwichs, colddrinks, hotdrinks, comboBox3, comboBox2, comboBox1, comboBox, line, food, drinks, feed,cafeteria, sett, logout);
     
        
       
          
        
    
    return pane3;
    }
  
    public AnchorPane  Salesman(){
       AnchorPane pane4 = new AnchorPane();
       Scene scene = new Scene(pane4,1000,500);
          
         s.setScene(scene);
            s.setTitle("SALESMAN");
            s.show();
       
       
        pane4.setStyle("-fx-background-color: #282828;");
        s.setTitle("Salesman Screen");
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(3.0);
        ds.setColor(Color.GRAY);
        
        Image image= new Image("Images/black-logo.png");
   ImageView imageView1 = new ImageView(image); 
    imageView1.setFitHeight(500); 
       imageView1.setFitWidth(1000);
            pane4.getChildren().add(imageView1); 
                
         Label cafeteria = new Label("SALESMAN ACCOUNT");
     cafeteria.setStyle("-fx-text-Fill: yellow");
     cafeteria.setFont(Font.font("Arial", FontWeight.BOLD, 50));
     
        cafeteria.setCache(true);
        cafeteria.setEffect(ds);
       Button ord = new Button("ORDER");
             ord.setStyle("-fx-background-color: #E8E8E8;");
                     ord.setCache(true);
                      ord.setEffect(ds);
                      ord.setPrefWidth(200.0);
                      ord.setOnAction((ActionEvent e) -> {
                            System.out.print(Menu());
        }); 
           
             
                 Button sett = new Button("Settings");
                     sett.setStyle("-fx-background-color: #E8E8E8;");
                     sett.setCache(true);
                      sett.setEffect(ds);
                      sett.setPrefWidth(200.0);
                      sett.setOnAction((ActionEvent e) -> {
                            System.out.print(Settings());
        }); 
                      Button logout = new Button("Log Out");
                      
                      
                        logout.setStyle("-fx-background-color: #E8E8E8;");
                     logout.setCache(true);
                      logout.setEffect(ds);
                      logout.setPrefWidth(200.0);
                      logout.setOnAction((ActionEvent e) -> {
                             Scene s1 =new Scene(Registeration(),1000,500);
                             s.setScene(s1);
                             s.show();
        }); 
                        
                     
    setTopAnchor(ord, 200.0);
        setRightAnchor(ord, 430.0);
    setTopAnchor(sett,400.0);
        setRightAnchor(sett, 430.0);
    
    
    
    setTopAnchor(cafeteria, 50.0);
        setRightAnchor(cafeteria, 250.0);
        
    setTopAnchor(logout,400.0);
        setRightAnchor(logout, 430.0);
    
        
      pane4.getChildren().addAll(cafeteria, ord, sett, logout);
        
          
      
          
        
    
    return pane4;
    }
 
    public AnchorPane  Manager(){
       AnchorPane pane5 = new AnchorPane();
        pane5.setStyle("-fx-background-color: #282828;");
         MenuBar menuBar = new MenuBar();
            Menu menuFile = new Menu("File");
               
          Scene scene = new Scene(pane5,1000,500);
          
         s.setScene(scene);
            s.setTitle("Manager");
            s.show();
       
       
        
        
 
         
         
        Image image= new Image("Images/black-logo.png");
   ImageView imageView1 = new ImageView(image); 
    imageView1.setFitHeight(500); 
       imageView1.setFitWidth(1000);
            pane5.getChildren().add(imageView1); 
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(3.0);
        ds.setColor(Color.GRAY);
                
         Label cafeteria = new Label("MANAGER ACCOUNT");
     cafeteria.setStyle("-fx-text-Fill: yellow");
     cafeteria.setFont(Font.font("Arial", FontWeight.BOLD, 50));
     
        cafeteria.setCache(true);
        cafeteria.setEffect(ds);
      Button mod = new Button("Modify Logs");
             mod.setStyle("-fx-background-color: #E8E8E8;");
                     mod.setCache(true);
                      mod.setEffect(ds);
                      mod.setPrefWidth(200.0);
           Button inv = new Button("Inventory");
             inv.setStyle("-fx-background-color: #E8E8E8;");
                     inv.setCache(true);
                      inv.setEffect(ds);
                      inv.setPrefWidth(200.0);
             
                 Button menu = new Button("Update Menu");
                     menu.setStyle("-fx-background-color: #E8E8E8;");
                     menu.setCache(true);
                      menu.setEffect(ds);
                      menu.setPrefWidth(200.0);
                     
                        Button prof= new Button("Profits");
                     prof.setStyle("-fx-background-color: #E8E8E8;");
                     prof.setCache(true);
                      prof.setEffect(ds);
                      prof.setPrefWidth(200.0);
                        Button logout = new Button("Log Out");
                        logout.setStyle("-fx-background-color: #E8E8E8;");
                     logout.setCache(true);
                      logout.setEffect(ds);
                      logout.setPrefWidth(200.0);
                       logout.setOnAction((ActionEvent e) -> {
                             Scene s1 =new Scene(Registeration(),1000,500);
                             s.setScene(s1);
                             s.show();
        }); 
                     
                     
    setTopAnchor(mod, 200.0);
        setRightAnchor(mod, 430.0);
    setTopAnchor(prof,350.0);
        setRightAnchor(prof, 430.0);
    setTopAnchor(inv,250.0);
        setRightAnchor(inv, 430.0);
    setTopAnchor(menu, 300.0);
        setRightAnchor(menu, 430.0);
    setTopAnchor(logout,400.0);
        setRightAnchor(logout, 430.0);
    
    setTopAnchor(cafeteria, 50.0);
        setRightAnchor(cafeteria, 300.0);
        
      pane5.getChildren().addAll(cafeteria, mod, prof, inv, logout);
     
        
          
 
          
        
    
    return pane5;
    }
  
    public AnchorPane Settings(){
      
      AnchorPane pane6 = new AnchorPane();
      Scene sett = new Scene(pane6,1000,500);
      s.setScene(sett);
      s.show();
      
      
      
      
     pane6.setStyle("-fx-background-color: #282828;");
    s.setTitle("Settings Screen");
    Image image= new Image("Images/black-logo.png");
   ImageView imageView1 = new ImageView(image); 
    imageView1.setFitHeight(500); 
       imageView1.setFitWidth(1000);
            pane6.getChildren().add(imageView1); 
    DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(3.0);
        ds.setColor(Color.GRAY);
    Label cafeteria = new Label("SETTINGS");
     cafeteria.setStyle("-fx-text-Fill: white");
     cafeteria.setFont(Font.font("Arial", FontWeight.BOLD, 50));
   
     cafeteria.setCache(true);
        cafeteria.setEffect(ds);
    Label log = new Label("ACCOUNT SETTINGS");
    log.setStyle("-fx-text-Fill: white");
     log.setFont(Font.font("Arial", FontWeight.BOLD, 25));
    log.setCache(true);
        log.setEffect(ds);
    
      Label cu = new Label("Current Password:");
      cu.setStyle("-fx-text-Fill: white");
     cu.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     
      Label nw = new Label("New Password :");
      nw.setStyle("-fx-text-Fill: white");
     nw.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     
      Label com = new Label("Confirm New Password :");
      com.setStyle("-fx-text-Fill: white");
     com.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     
      Button conn = new Button("Confirm");
      conn.setStyle("-fx-background-color: yellow; ");
       conn.setCache(true);
        conn.setEffect(ds);
        
         Button back = new Button("BACK");
     back.setStyle("-fx-background-color: #E8E8E8;");
                     back.setCache(true);
                      back.setEffect(ds);
                      back.setPrefWidth(50.0);
       back.setOnAction((ActionEvent e) -> {
                            Customer();
        }); 
     back.setLayoutX(270);
                   back.setLayoutY(350);
      
      
       PasswordField cuw = new PasswordField();
       PasswordField nww = new PasswordField();
         PasswordField comm = new PasswordField();

        cuw.setPromptText("Enter Your Password");
        nww.setPromptText("New Password");
        comm.setPromptText("Confirm new");
        
               conn.setLayoutX(160);
               conn.setLayoutY(350);
               
         comm.setLayoutX(190);
    comm.setLayoutY(300);
    
     nww.setLayoutX(160);
    nww.setLayoutY(250);
    
    
    cuw.setLayoutX(160);
    cuw.setLayoutY(200);
        
    
    
      com.setLayoutX(50);
    com.setLayoutY(300);
    
     nw.setLayoutX(50);
    nw.setLayoutY(250);
    
    
    cu.setLayoutX(50);
    cu.setLayoutY(200);
    
 
    
    log.setLayoutX(100);
    log.setLayoutY(125);
    
    cafeteria.setLayoutX(400);
    cafeteria.setLayoutY(50);
    
    pane6.getChildren().addAll(back,cafeteria, log, cu, nw, com, cuw, nww, comm, conn);
    
  
  
  
  
  return pane6;
  }
 
    public AnchorPane Feedback(){
   
   AnchorPane pane7 = new AnchorPane();
  Scene scene = new Scene(pane7 , 1000 , 500);
  s.setScene(scene);
  s.setTitle("FEEDBACK");
  s.show();
   
   
   
   pane7.setStyle("-fx-background-color: #282828;");
   
   Image image= new Image("Images/black-logo.png");
   ImageView imageView1 = new ImageView(image); 
    imageView1.setFitHeight(500); 
       imageView1.setFitWidth(1000);
            pane7.getChildren().add(imageView1); 
   
   DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(3.0);
        ds.setColor(Color.GRAY);
   
    Button back = new Button("BACK");
     back.setStyle("-fx-background-color: #E8E8E8;");
                     back.setCache(true);
                      back.setEffect(ds);
                      back.setPrefWidth(50.0);
       back.setOnAction((ActionEvent e) -> {
                            System.out.print(Customer());
        }); 
       back.setLayoutX(300);
                   back.setLayoutY(450);

    
        Label cafeteria = new Label("FEEDBACK");
        cafeteria.setStyle("-fx-text-Fill: yellow");
     cafeteria.setFont(Font.font("Arial", FontWeight.BOLD, 50));
    
     cafeteria.setCache(true);
        cafeteria.setEffect(ds);
        
     Line line = new Line();
        line.setStartX(100.0f);
            line.setStartY(180.0f);
                line.setEndX(320.0f);
                    line.setEndY(180.0f);
                    line.setStroke(Color.YELLOW);
                    line.setStrokeWidth(5);

      Label feed = new Label("YOUR FEEDBACK");
      
      feed.setStyle("-fx-text-Fill: white");
      
     feed.setFont(Font.font("Arial", FontWeight.BOLD, 25));
      feed.setLayoutX(100);
      feed.setLayoutY(150);
     
      Label ti = new Label("Title :");
       ti.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        ti.setStyle("-fx-text-Fill: white");
         ti.setLayoutX(50);
          ti.setLayoutY(200);
           
       Label sub = new Label("Subject :");
       sub.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        sub.setStyle("-fx-text-Fill: white");
         sub.setLayoutX(50);
          sub.setLayoutY(275);    
          Button submit = new Button("SUBMIT");
                  submit.setLayoutX(200);
                   submit.setLayoutY(450);
                    submit.setStyle("-fx-background-color: yellow; ");
                     submit.setCache(true);
                      submit.setEffect(ds);
          
          TextField subb = new TextField();
                subb.setLayoutX(100);
                 subb.setLayoutY(200);
          TextField tii = new TextField();
          tii.setPrefHeight(150.0);
           tii.setPrefWidth(200.0);
            tii.setLayoutX(150);
                 tii.setLayoutY(270);
                 setTopAnchor(cafeteria, 50.0);
        setRightAnchor(cafeteria, 380.0);
     pane7.getChildren().addAll(back, cafeteria, feed, line, ti, sub, subb, tii, submit);
     
    
   
   
   return pane7;
   }
   
    public AnchorPane Menu(){
   
       AnchorPane pane8 = new AnchorPane();
        Scene scene = new Scene(pane8,1000,500);
          
         s.setScene(scene);
            s.setTitle("Menu");
            s.show();
       
       
       
        pane8.setStyle("-fx-background-color: #282828;");
       
        Image image= new Image("Images/black-logo.png");
   ImageView imageView1 = new ImageView(image); 
    imageView1.setFitHeight(500); 
       imageView1.setFitWidth(1000);
            pane8.getChildren().add(imageView1); 
             DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(3.0);
        ds.setColor(Color.GRAY);
        ComboBox comboBox = new ComboBox();
           ComboBox comboBox1 = new ComboBox();
            ComboBox comboBox2 = new ComboBox();
                ComboBox comboBox3 = new ComboBox();
         Label cafeteria = new Label("MENU");
     cafeteria.setStyle("-fx-text-Fill: yellow");
        cafeteria.setFont(Font.font("Arial", FontWeight.BOLD, 50));
            cafeteria.setCache(true);
                cafeteria.setEffect(ds);
      pane8.getChildren().add(cafeteria);
       Button back = new Button("BACK");
     back.setStyle("-fx-background-color: #E8E8E8;");
                     back.setCache(true);
                      back.setEffect(ds);
                      back.setPrefWidth(100.0);
       back.setOnAction((ActionEvent e) -> {
                            System.out.print(Salesman());
        }); 
       setTopAnchor(back, 120.0);
                    setRightAnchor(back, 450.0);
       
       Label drinks = new Label("DRINKS");
       drinks.setStyle("-fx-text-Fill: white");
     drinks.setFont(Font.font("Arial", FontWeight.BOLD, 25));
     drinks.setCache(true);
        drinks.setEffect(ds);
     Line line = new Line();
        line.setStartX(500.0f);
            line.setStartY(200.0f);
                line.setEndX(500.0f);
                    line.setEndY(450.0f);
                    line.setStroke(Color.WHITE);
                    line.setStrokeWidth(5);
   
    
      Label hotdrinks = new Label("Hot Drinks :");
       hotdrinks.setStyle("-fx-text-Fill: white");
     hotdrinks.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     comboBox3.getItems().addAll( "Nescafe", "Coffe", "Tea");
     comboBox3.setPromptText("hot drinks");
     TextField price4 = new TextField("5");
                price4.setEditable(false);
                    price4.setPrefWidth(30.0);
      
      Label colddrinks = new Label("Cold Drinks :");
      colddrinks.setStyle("-fx-text-Fill: white");
     colddrinks.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     comboBox2.getItems().addAll( "Pepsi", "Fayrouz", "RedBull", "Mango");
     comboBox2.setPromptText("cold drinks");
     TextField price3 = new TextField("5");
                price3.setEditable(false);
                    price3.setPrefWidth(30.0);
     
        
      Label sandwichs = new Label("Sandwichs :");
      sandwichs.setStyle("-fx-text-Fill: white");
     sandwichs.setFont(Font.font("Arial", FontWeight.BOLD, 12));
     comboBox1.getItems().addAll( "شاورما", "بانية", "تونة");
     comboBox1.setPromptText("Sandwichs");
     TextField price1 = new TextField("15");
                price1.setEditable(false);
                    price1.setPrefWidth(30.0);
     
      Label biscuts = new Label("Biscuts :");
        biscuts.setStyle("-fx-text-Fill: white");
            biscuts.setFont(Font.font("Arial", FontWeight.BOLD, 12));  
            comboBox.getItems().addAll( "Oreo", "Borio", "Ulker");
            comboBox.setPromptText("Biscuts");
            TextField price2 = new TextField("2");
                price2.setEditable(false);
                    price2.setPrefWidth(30.0);
            
        
        Label food = new Label("FOOD");
        food.setStyle("-fx-text-Fill: white");
     food.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        food.setCache(true);
        food.setEffect(ds);
        Label quantity = new Label("quantity");
        quantity.setStyle("-fx-text-Fill: white");
     quantity.setFont(Font.font("Arial", FontWeight.BOLD, 14));
     Label quantity1 = new Label("quantity");
        quantity1.setStyle("-fx-text-Fill: white");
     quantity1.setFont(Font.font("Arial", FontWeight.BOLD, 14));
     
            Button shop = new Button("ORDER");
                setTopAnchor(shop, 150.0);
                    setRightAnchor(shop, 450.0);
                        shop.setStyle("-fx-background-color: #E8E8E8;");
                            shop.setCache(true);
                                shop.setEffect(ds);
                                    shop.setPrefWidth(100.0);
                                    
                                    
                                    
              Button confirm = new Button("Total");
                         confirm.setStyle("-fx-background-color: #E8E8E8;");
                     confirm.setCache(true);
                      confirm.setEffect(ds);
                      confirm.setPrefWidth(100.0);    
       TextField  result = new TextField();
      result.setEditable(false);
       result.setPrefWidth(75.0);
          confirm.setOnAction(e -> {
            Integer value1 = Integer.valueOf(price1.getText());
            Integer value2 = Integer.valueOf(price2.getText());
            Integer value3 = Integer.valueOf(tfCount.getText());
            Integer value4 = Integer.valueOf(tfCount1.getText());
            Integer value5 = Integer.valueOf(price3.getText());
            Integer value6 = Integer.valueOf(price4.getText());
            Integer value7 = Integer.valueOf(tfCount2.getText());
            Integer value8 = Integer.valueOf(tfCount3.getText());
            Integer r = (value1*value3) + (value2*value4)+ (value5*value7)+ (value6*value8);
            result.setText(r.toString());
        });                         
                                    
            
                                    
   
            
     
tfCount = new TextField("0");
      tfCount.setEditable(false);
       tfCount.setPrefWidth(30.0);
          btnCount = new Button("Add");
             btnCount.setOnAction(e -> tfCount.setText(++count + ""));
                btnsub = new Button("Sub.");
                    btnsub.setOnAction(evt -> tfCount.setText(--count + ""));
            
      
      tfCount1 = new TextField("0");
      tfCount1.setEditable(false);
       tfCount1.setPrefWidth(30.0);
      btnCount1 = new Button("Add");
      btnCount1.setOnAction(e -> tfCount1.setText(++count1 + ""));
        btnsub1 = new Button("Sub.");
                    btnsub1.setOnAction(evt -> tfCount1.setText(--count1 + ""));

      tfCount2 = new TextField("0");
      tfCount2.setEditable(false);
       tfCount2.setPrefWidth(30.0);
      btnCount2 = new Button("Add");
      btnCount2.setOnAction(e -> tfCount2.setText(++count2 + ""));
      btnsub2 = new Button("Sub.");
                    btnsub2.setOnAction(evt -> tfCount2.setText(--count2 + ""));
        
      
      tfCount3 = new TextField("0");
      tfCount3.setEditable(false);
       tfCount3.setPrefWidth(30.0);
      btnCount3 = new Button("Add");
      btnCount3.setOnAction(e -> tfCount3.setText(++count3 + ""));
      btnsub3 = new Button("Sub.");
                    btnsub3.setOnAction(evt -> tfCount3.setText(--count3 + ""));

    setTopAnchor(biscuts, 300.0);
        setLeftAnchor(biscuts, 50.0);
    setTopAnchor(comboBox, 300.0);
        setLeftAnchor(comboBox, 130.0);
    setTopAnchor(quantity, 200.0);
        setLeftAnchor(quantity, 300.0);
    setTopAnchor(tfCount, 300.0);
        setLeftAnchor(tfCount, 310.0);
    setTopAnchor(btnCount, 300.0);
        setLeftAnchor(btnCount, 380.0);
    setTopAnchor(btnsub, 300.0);
        setLeftAnchor(btnsub, 450.0);
        setTopAnchor(price1, 300.0);
        setLeftAnchor(price1, 250.0);
        
        
    setTopAnchor(sandwichs, 250.0);
        setLeftAnchor(sandwichs, 50.0);
    setTopAnchor(comboBox1, 250.0);
        setLeftAnchor(comboBox1, 150.0);
    setTopAnchor(tfCount3, 250.0);
        setLeftAnchor(tfCount3, 310.0);
    setTopAnchor(btnCount3, 250.0);
        setLeftAnchor(btnCount3, 380.0); 
    setTopAnchor(btnsub3, 250.0);
        setLeftAnchor(btnsub3, 450.0); 
        setTopAnchor(price2, 250.0);
        setLeftAnchor(price2, 250.0);
        
     setTopAnchor(food, 150.0);
        setLeftAnchor(food, 100.0);
    setTopAnchor(drinks, 150.0);
        setRightAnchor(drinks, 150.0);
        
    setTopAnchor(colddrinks, 250.0);
        setRightAnchor(colddrinks, 400.0);
     setTopAnchor(comboBox2, 250.0);
        setRightAnchor(comboBox2, 280.0);
    setTopAnchor(btnCount1, 250.0);
        setRightAnchor(btnCount1, 100.0);
    setTopAnchor(tfCount1, 250.0);
        setRightAnchor(tfCount1, 180.0);
    setTopAnchor(btnsub1, 250.0);
        setRightAnchor(btnsub1, 50.0); 
        setTopAnchor(price3, 250.0);
        setRightAnchor(price3, 230.0);
     
        
    setTopAnchor(hotdrinks, 300.0);
        setRightAnchor(hotdrinks, 400.0);
     setTopAnchor(comboBox3, 300.0);
        setRightAnchor(comboBox3, 280.0);
    setTopAnchor(btnCount2, 300.0);
        setRightAnchor(btnCount2, 100.0);
    setTopAnchor(tfCount2, 300.0);
        setRightAnchor(tfCount2, 180.0);
     setTopAnchor(btnsub2, 300.0);
        setRightAnchor(btnsub2, 50.0);   
        setTopAnchor(price4, 300.0);
        setRightAnchor(price4, 230.0);
        setTopAnchor(result,420.0);
        setRightAnchor(result, 750.0);    
    setTopAnchor(confirm,450.0);
        setRightAnchor(confirm, 750.0);
        
        
    setTopAnchor(quantity1, 200.0);
        setRightAnchor(quantity1, 170.0);
     
      setTopAnchor(cafeteria, 50.0);
        setRightAnchor(cafeteria, 450.0);
        pane8.getChildren().addAll( result, price4, price3, price2, price1, confirm, back, btnsub3, btnsub2, btnsub1 ,btnsub, shop, btnCount3 ,tfCount3 ,btnCount2 ,tfCount2 ,btnCount1 ,tfCount1 ,btnCount ,tfCount ,quantity, quantity1, drinks, food, line, biscuts, sandwichs, hotdrinks, colddrinks, comboBox, comboBox1, comboBox2, comboBox3);
        
     
   return pane8;
   }
 
    
 
    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene1 = new Scene(Registeration(),1000,500);
        s=primaryStage;
        primaryStage.setScene(scene1);
        primaryStage.setTitle("REGISTERATION");
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }


    
}


