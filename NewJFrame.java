package rgr;

//импорт библеотек.
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//фрейм
public class NewJFrame extends javax.swing.JFrame {
    public NewJFrame() {
        initComponents();
    }
    //объявление компонентов
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    int days = 1; //переменная отвечающая за кол-во дней.
    int countryFactor = 10000; //переменная отвечающая за стоимость перелета в конкретную страну и обратно.
    int hotelCost = 1000; //переменная отвечающая за стоимость 1 суток проживания в отеле.
    int peopleCount = 1; //переменная отвечающая за кол-во людей.
    int daysCount= 0; //переменная отвечающая за кол-во дней.
    int finalCost = 0; //переменая отвечающая за итоговую стоимость.

    @SuppressWarnings("unchecked")
    private void initComponents() {
    	//объявление компонентов формы.
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        //настройки окна.
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 0));
        //настройки надписи
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Сколько человек?");
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Время года");
        //настройки выпадающего списка.
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Варшава", "Амстердам", "Вена", "Москва", "Дубай", "Барселона" }));
        //подключение обработчика событий.
        jComboBox2.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "лето", "осень", "зима", "весна" }));
        //подключение обработчика событий.
        jComboBox5.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        //настройки выпадающего списка.
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        //подключение обработчика событий.
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        //настройки надписи
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Выберите направление");
        //настройки надписи
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Выберите количество дней");
     	//настройки выпадающего списка.
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        //подключение обработчика событий.
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        //настройки выпадающего списка.
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        //подключение обработчика событий.
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        //настройки надписи
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Уровень отеля (в звёздах)");
        //настройки надписи
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("");
        //настройки кнопкие 
        jButton1.setText("Рассчитать стоимость");
        //подключение обработчика событий.
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        //настройки поля ввода
        jTextField1.setText("Кол-во дней (1 - 31).");
        //подключение обработчика событий.
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        //подключение обработчика событий.
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        //Ниже представлена разметка интерфейса
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	    .addGap(0, 122, Short.MAX_VALUE)
	    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(jComboBox2, 0, 239, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING,   javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE))
        .addGap(125, 125, 125))))
        );
        layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(37, 37, 37)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(27, 27, 27)
        .addComponent(jButton1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(25, 25, 25))
        );
        pack();
    }
    //настройки обработчика событий.
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
    	//присвоение переменной значения в зависимости от выбора пользователя.
       JComboBox box = (JComboBox)evt.getSource();
                        String item = (String)box.getSelectedItem();
           switch (item) {
           case ("Варшава"):
               countryFactor = 9300;
               break;
           case ("Амстердам"):
               countryFactor = 20000;
               break;
           case ("Вена"):
               countryFactor = 23000;
               break;
           case ("Москва"):
               countryFactor = 5000;
               break;
           case ("Дубай"):
               countryFactor = 45600;
               break;
           case ("Барселона"):
               countryFactor = 32000;
               break;
           default:
               break;
       }
    }
    //настройки обработчика событий.
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    	//присвоение переменной значения выбранного пользователем.
        JComboBox box = (JComboBox)evt.getSource();
        String item = (String)box.getSelectedItem();
        daysCount = Integer.parseInt(item);
    }
    //настройки обработчика событий.
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {
    	//присвоение переменной значения выбранного пользователем.
        JComboBox box = (JComboBox)evt.getSource();
        String item = (String)box.getSelectedItem();
        peopleCount = Integer.parseInt(item);
    }
    //настройки обработчика событий.
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {
    	//присвоение переменной значения в зависимости от выбора пользователя.
        JComboBox box = (JComboBox)evt.getSource();
        String item = (String)box.getSelectedItem();
           switch (item) {
           case ("1"):
               hotelCost = 1000;
               break;
           case ("2"):
               hotelCost = 1500;
               break;
           case ("3"):
               hotelCost = 2000;
               break;
           case ("4"):
               hotelCost = 3000;
               break;
           case ("5"):
               hotelCost = 4000;
               break;
           default:
               break;
       }
           
    }
    
    //обработчик события ввода значения.
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(isDigit(jTextField1.getText())) {
          daysCount = Integer.parseInt(jTextField1.getText());
        } else {
          jTextField1.setText("Введено некорректное кол-во дней");
        }
    }                                           
	//обработчик события клика на поле ввода.
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {                                         
        jTextField1.setText("");
    }                                        
    //проверка введенного значения на корректность
    private static boolean isDigit(String s) throws NumberFormatException {
    try {
        if(Integer.parseInt(s)>0&&Integer.parseInt(s)<=31)return true;
        else return false;
    } catch (NumberFormatException e) {
        return false;
    }}
    public static void main(String args[]) {//метод запуска фрейма.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
        //запуск фрейма.
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
  //обработчик события кнопки расчета.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        finalCost = countryFactor*peopleCount + hotelCost*peopleCount*daysCount;//Формула расчета стоимости.
        if(daysCount==0) jLabel5.setText("Стоимость тура: "+String.valueOf(finalCost));
        else jLabel5.setText("Стоимость: "+String.valueOf(finalCost));
    } 
    
}
