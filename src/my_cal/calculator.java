package my_cal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;
import javafx.print.PaperSource;
import javax.swing.Timer;

public class calculator extends javax.swing.JFrame {

    private boolean displayzero;
    private boolean displaydec;

    private double ina;
    private double inb;
    private double out;

    private boolean dgrrad;
    private boolean sh;

    private byte op;
    
    private double history[] = new double[3];

    public calculator() {
        initComponents();
        time();
        date();
    }

    void date() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        date.setText(s.format(d));
    }

    void time() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                time.setText(s.format(d));
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        displayone = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        division = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        fact = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        c = new javax.swing.JButton();
        cosin = new javax.swing.JButton();
        power = new javax.swing.JButton();
        square = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        rightbrack = new javax.swing.JButton();
        leftbrack = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        memplus = new javax.swing.JButton();
        memminus = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        cube = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        log = new javax.swing.JButton();
        downhistoy = new javax.swing.JButton();
        uphistory = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        displaymem = new javax.swing.JTextField();
        displaytwo = new javax.swing.JTextField();
        onedivide = new javax.swing.JButton();
        cbrt = new javax.swing.JButton();
        degree = new javax.swing.JRadioButton();
        radian = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayhis = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        cdisone = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        cdistwo = new javax.swing.JTextField();
        covert = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        time = new javax.swing.JMenu();
        date = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        displayone.setBackground(new java.awt.Color(199, 218, 220));
        displayone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        displayone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displayone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayoneActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        division.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        multiplication.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        multiplication.setText("*");
        multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationActionPerformed(evt);
            }
        });

        percentage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        percentage.setText("%");
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });

        fact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fact.setText("n!");
        fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factActionPerformed(evt);
            }
        });

        ce.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ce.setText("CE");
        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });

        c.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        cosin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cosin.setText("cosin");
        cosin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinActionPerformed(evt);
            }
        });

        power.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        power.setText("x^y");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        square.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        square.setText("2^x");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        mod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mod.setText("Mod");

        sqrt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sqrt.setText("sqrt");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        rightbrack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rightbrack.setText(")");
        rightbrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightbrackActionPerformed(evt);
            }
        });

        leftbrack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        leftbrack.setText("(");
        leftbrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftbrackActionPerformed(evt);
            }
        });

        pi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pi.setText("π");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        memplus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        memplus.setText("M+");
        memplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memplusActionPerformed(evt);
            }
        });

        memminus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        memminus.setText("M-");
        memminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memminusActionPerformed(evt);
            }
        });

        ms.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ms.setText("MS");
        ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        cube.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cube.setText("3^x");
        cube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        dot.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        backspace.setText("<-");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        downhistoy.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        downhistoy.setText("˅");
        downhistoy.setAlignmentX(0.5F);
        downhistoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downhistoyActionPerformed(evt);
            }
        });

        uphistory.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        uphistory.setText("˄");

        plusminus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        plusminus.setText("±");
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });

        displaymem.setBackground(new java.awt.Color(199, 218, 220));
        displaymem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        displaymem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displaymem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaymemActionPerformed(evt);
            }
        });

        displaytwo.setBackground(new java.awt.Color(199, 218, 220));
        displaytwo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        displaytwo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displaytwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaytwoActionPerformed(evt);
            }
        });

        onedivide.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        onedivide.setText("1/x");
        onedivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onedivideActionPerformed(evt);
            }
        });

        cbrt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbrt.setText("cbrt");
        cbrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrtActionPerformed(evt);
            }
        });

        buttonGroup1.add(degree);
        degree.setText("Degree");
        degree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radian);
        radian.setText("Radian");
        radian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radianMouseClicked(evt);
            }
        });
        radian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radianActionPerformed(evt);
            }
        });

        displayhis.setColumns(20);
        displayhis.setRows(5);
        jScrollPane1.setViewportView(displayhis);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("History");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Converter");

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", " " }));

        cdisone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jComboBox2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        cdistwo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cdistwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdistwoActionPerformed(evt);
            }
        });

        covert.setText("Convert");
        covert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                covertActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a option", "Mass", "Length", "Temprature" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText(" Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Graphs");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setText("About");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        time.setText(" Time");
        jMenuBar1.add(time);

        date.setText("Date");
        jMenuBar1.add(date);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cdistwo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cdisone))
                                    .addComponent(jComboBox3, 0, 311, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(covert, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(displaytwo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radian)
                                .addGap(71, 71, 71)
                                .addComponent(degree))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memminus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memplus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displaymem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displayone, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(seven)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(eight)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nine))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(plusminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(zero))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(four)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(five))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(one)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(two))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(multiplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(equal)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(leftbrack)
                                    .addComponent(sin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rightbrack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sqrt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(square))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mod))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(cosin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cube, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(power, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(downhistoy, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uphistory, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onedivide, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, cbrt, cosin, cube, downhistoy, equal, fact, leftbrack, log, mod, multiplication, onedivide, percentage, pi, power, rightbrack, sin, sqrt, square, tan, uphistory});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backspace, c, ce, dot, eight, five, four, memminus, memplus, ms, nine, one, seven, six, three, two, zero});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displaytwo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(displayone, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uphistory, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downhistoy, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onedivide, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(power)
                            .addComponent(cube)
                            .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cosin)
                            .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fact)
                            .addComponent(cbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sqrt)
                                    .addComponent(square))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leftbrack)
                            .addComponent(rightbrack)
                            .addComponent(mod)
                            .addComponent(percentage)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(memplus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(memminus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displaymem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radian)
                            .addComponent(degree))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eight)
                                    .addComponent(nine))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(four)
                                    .addComponent(five)
                                    .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(one)
                                    .addComponent(two)
                                    .addComponent(three)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(division)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add)
                                        .addGap(55, 55, 55))
                                    .addComponent(sub, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zero)
                            .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cdisone)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(cdistwo))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(covert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, cosin, division, equal, fact, leftbrack, mod, percentage, pi, power, rightbrack, sqrt, square, sub});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backspace, c, ce, cube, dot, eight, five, four, nine, one, seven, six, three, two, zero});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed

        ina = Double.parseDouble(String.valueOf(displayone.getText()));

        displayone.setText("0");
        displaytwo.setText(String.valueOf(ina) + "%(");

        displaydec = false;
        displayzero = false;

        op = 5;

    }//GEN-LAST:event_percentageActionPerformed

    private void multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationActionPerformed
        displayone.setText(displayone.getText() + "*");

    }//GEN-LAST:event_multiplicationActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        displayone.setText(displayone.getText() + "+");


    }//GEN-LAST:event_addActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        displayone.setText(displayone.getText() + "2");

    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        displayone.setText(displayone.getText() + "3");


    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        displayone.setText(displayone.getText() + "4");


    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        displayone.setText(displayone.getText() + "5");


    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        displayone.setText(displayone.getText() + "6");


    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        displayone.setText(displayone.getText() + "7");

    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed

        displayone.setText(displayone.getText() + "8");

    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        displayone.setText(displayone.getText() + "9");


    }//GEN-LAST:event_nineActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        if (!displayone.getText().contains(".")) {
            displayone.setText(displayone.getText() + dot.getText());
        }
    }//GEN-LAST:event_dotActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if (!displayzero && !displaydec) {
            displayone.setText(null);

        }
        displayone.setText(displayone.getText() + "0");


    }//GEN-LAST:event_zeroActionPerformed

    private void displayoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayoneActionPerformed
        this.setResizable(true);
    }//GEN-LAST:event_displayoneActionPerformed

    private void downhistoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downhistoyActionPerformed
        int i = 0;    
        
        for(i=0; i<5;i++)
        {
           // displayone.setText(Double.parseDouble(history));
        }
    }//GEN-LAST:event_downhistoyActionPerformed

    private void leftbrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftbrackActionPerformed
        displayone.setText("(");

    }//GEN-LAST:event_leftbrackActionPerformed

    private void rightbrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightbrackActionPerformed
        displayone.setText(")");

    }//GEN-LAST:event_rightbrackActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        double inb = Double.parseDouble(String.valueOf(displayone.getText()));
        if (!sh) {
            if (!dgrrad) {
                displayone.setText("sin(" + String.valueOf(inb) + ")");
                inb = inb * 0.0174532925;
            }
            out = Math.sin(inb);
        }
        else {
            displayone.setText("sinh(" + String.valueOf(inb) + ")");
            out = Math.sinh(inb);
        }

        displaytwo.setText(String.valueOf(inb));
        out = 0;
        op = 0;
    }//GEN-LAST:event_sinActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        displayone.setText(displayone.getText() + "1");

    }//GEN-LAST:event_oneActionPerformed

    private void cosinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosinActionPerformed
        double inb = Double.parseDouble(String.valueOf(displayone.getText()));
        if (!sh) {
            if (!dgrrad) {
                displayone.setText("cos(" + String.valueOf(inb) + ")");
                inb = inb * 0.0174532925;
            }
            out = Math.sin(inb);
        }
        else {
            displayone.setText("cosh(" + String.valueOf(inb) + ")");
            out = Math.sinh(inb);
        }

        displaytwo.setText(String.valueOf(inb));
        out = 0;
        op = 0;
    }//GEN-LAST:event_cosinActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        double inb = Double.parseDouble(String.valueOf(displayone.getText()));
        if (!sh) {
            if (!dgrrad) {
                displayone.setText("tan(" + String.valueOf(inb) + ")");
                inb = inb * 0.0174532925;
            }
            out = Math.sin(inb);
        }
        else {
            displayone.setText("tanh(" + String.valueOf(inb) + ")");
            out = Math.sinh(inb);
        }

        displaytwo.setText(String.valueOf(inb));
        out = 0;
        op = 0;
    }//GEN-LAST:event_tanActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.log(num);
        displaytwo.setText(String.valueOf(num));
        op = 0;
        out = 0;
    }//GEN-LAST:event_logActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(false);
        this.setSize(310, 830);
        displayone.setSize(279, 58);
        displaytwo.setSize(279, 58);
    }//GEN-LAST:event_formWindowActivated

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = num * (-1);
        displaytwo.setText(String.valueOf(num));

    }//GEN-LAST:event_plusminusActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(false);
        this.setSize(310, 830);
        displayone.setSize(279, 58);
        displaytwo.setSize(279, 58);
        displayhis.setSize(220, 80);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setResizable(false);
        this.setSize(633, 830);
        displaytwo.setSize(609, 58);
        displayone.setSize(609, 58);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
        displayone.setText("");
        op = 0;
        out = 0;
        displaytwo.setText("");
    }//GEN-LAST:event_ceActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        String backsp = null;

        int length = displayone.getText().length();
        int number = displayone.getText().length() - 1;

        if (length > 0) {
            StringBuilder sb = new StringBuilder(displayone.getText());
            sb.deleteCharAt(number);
            backsp = sb.toString();
            displayone.setText(backsp);
        }
    }//GEN-LAST:event_backspaceActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.sqrt(num);
        displaytwo.setText(String.valueOf(num));
        op = 0;
        out = 0;
    }//GEN-LAST:event_sqrtActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.pow(num, 2);
        displaytwo.setText(String.valueOf(num));
        op = 0;
        out = 0;
    }//GEN-LAST:event_squareActionPerformed

    private void displaymemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaymemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displaymemActionPerformed

    private void displaytwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaytwoActionPerformed
        int i;
        for(i=0; i<5; i++)
        {
            history[i] = Double.parseDouble(String.valueOf(displaytwo.getText()));
        }
    }//GEN-LAST:event_displaytwoActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.pow(num, num);
        displaytwo.setText(String.valueOf(num));
        op = 0;
        out = 0;
    }//GEN-LAST:event_powerActionPerformed

    private void cubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.pow(num, 3);
        displaytwo.setText(String.valueOf(num));
        op = 0;
        out = 0;
    }//GEN-LAST:event_cubeActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        Scanner scan = new Scanner(displayone.getText());
        /* Create stacks for operators and operands */

        Stack<Integer> op = new Stack<Integer>();

        Stack<Double> val = new Stack<Double>();
        /* Create temporary stacks for operators and operands */

        Stack<Integer> optmp = new Stack<Integer>();

        Stack<Double> valtmp = new Stack<Double>();
        /* Accept expression */

        System.out.println("Evaluation Of Arithmetic Expression Using Stacks Test\n");
        System.out.println("Enter expression\n");
        String input = scan.next();
        input = "0" + input;
        input = input.replaceAll("-", "+-");
        /* Store operands and operators in respective stacks */
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '-') {
                temp = "-" + temp;
            }
            else if (ch != '+' && ch != '*' && ch != '/') {
                temp = temp + ch;
            }
            else {
                val.push(Double.parseDouble(temp));
                op.push((int) ch);
                temp = "";
            }
        }
        val.push(Double.parseDouble(temp));
        /* Create char array of operators as per precedence */
        /* -ve sign is already taken care of while storing */
        char operators[] = {'/', '*', '+'};
        /* Evaluation of expression */
        for (int i = 0; i < 3; i++) {
            boolean it = false;
            while (!op.isEmpty()) {
                int optr = op.pop();
                double v1 = val.pop();
                double v2 = val.pop();
                if (optr == operators[i]) {
                    /* if operator matches evaluate and store in temporary stack */
                    if (i == 0) {
                        valtmp.push(v2 / v1);
                        it = true;
                        break;
                    }
                    else if (i == 1) {
                        valtmp.push(v2 * v1);
                        it = true;
                        break;
                    }
                    else if (i == 2) {
                        valtmp.push(v2 + v1);
                        it = true;
                        break;
                    }
                }
                else {
                    valtmp.push(v1);
                    val.push(v2);
                    optmp.push(optr);
                }
            }
            /* Push back all elements from temporary stacks to main stacks */
            while (!valtmp.isEmpty()) {
                val.push(valtmp.pop());
            }
            while (!optmp.isEmpty()) {
                op.push(optmp.pop());
            }
            /* Iterate again for same opertor */
            if (it) {
                i--;
            }
        }
        double x = val.pop();
        displaytwo.setText(Double.toString(x));

        displayhis.setText(String.valueOf(displaymem.getText() + displayone.getText()+"\n---------------------" +"\nAnswer = " + displaytwo.getText()));


    }//GEN-LAST:event_equalActionPerformed

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
        String mem = String.valueOf(displaymem.getText());

        if (mem != "0") {
            displayone.setText(String.valueOf(displayone.getText() + displaymem.getText()));
        }
        else {
            displayone.setText(String.valueOf(displayone.getText()));
        }
    }//GEN-LAST:event_msActionPerformed

    private void memminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memminusActionPerformed

        displaymem.setText("0");

    }//GEN-LAST:event_memminusActionPerformed

    private void memplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memplusActionPerformed

        displaymem.setText(String.valueOf(displaytwo.getText()));
    }//GEN-LAST:event_memplusActionPerformed

    private void onedivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onedivideActionPerformed
        inb = Double.parseDouble(displayone.getText());
        out = inb * -1;

        if (out > -1000000000 && out < 1000000000) {
            displayone.setText(String.valueOf(out));
        }
        else {
            displayone.setText("Error");
        }
        displaytwo.setText("1/" + String.valueOf(inb));
        out = 0;
        op = 0;

    }//GEN-LAST:event_onedivideActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        displayone.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_piActionPerformed

    private void cbrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbrtActionPerformed
        inb = Double.parseDouble(displayone.getText());
        out = Math.cbrt(inb);

        if (out > -1000000000 && out < 1000000000) {
            displayone.setText(String.valueOf(out));
        }
        else {
            displayone.setText("Error");
        }
        displaytwo.setText(String.valueOf(inb));
        out = 0;
        op = 0;
    }//GEN-LAST:event_cbrtActionPerformed

    private void radianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radianMouseClicked
        if (!sh) {
            sh = true;
        }
        else {
            sh = false;
        }
    }//GEN-LAST:event_radianMouseClicked

    private void degreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeActionPerformed
        dgrrad = false;
    }//GEN-LAST:event_degreeActionPerformed

    private void radianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radianActionPerformed
        dgrrad = true;
    }//GEN-LAST:event_radianActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        displayone.setText(displayone.getText() + "-");

    }//GEN-LAST:event_subActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        displayone.setText(displayone.getText() + "/");
    }//GEN-LAST:event_divisionActionPerformed

    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        displayone.setText("");
        displaytwo.setText("");
    }//GEN-LAST:event_cActionPerformed

    private void cdistwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdistwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdistwoActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        cdisone.setText("");
        cdistwo.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void covertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_covertActionPerformed
        
    }//GEN-LAST:event_covertActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        String item = null;
        String String = item;
        
        if(jComboBox3.getSelectedItem() == "Length")
        {

            item = "Metre";
            jComboBox1.addItem(item);
            item = "Kilo metre";
            jComboBox1.addItem(item);
            item = "Mile";
            jComboBox1.addItem(item);
            item = "Yard";
            jComboBox1.addItem(item);
            item = "Feet";
            jComboBox1.addItem(item);
            item = "Inch";
            jComboBox1.addItem(item);

            item = "Metre";
            jComboBox2.addItem(item);
            item = "Kilo metre";
            jComboBox2.addItem(item);
            item = "Mile";
            jComboBox2.addItem(item);
            item = "Yard";
            jComboBox2.addItem(item);
            item = "Feet";
            jComboBox2.addItem(item);
            item = "Inch";
            jComboBox2.addItem(item);
        }
        else if(jComboBox3.getSelectedItem() == "Mass")
        {
            item = "Gram";
            jComboBox1.addItem(item);
            item = "Kilogram";
            jComboBox1.addItem(item);
            item = "Pound";
            jComboBox1.addItem(item);
            item = "Ton";
            jComboBox1.addItem(item);
            item = "Ounce";
            jComboBox1.addItem(item);

            item = "Gram";
            jComboBox2.addItem(item);
            item = "Kilogram";
            jComboBox2.addItem(item);
            item = "Pound";
            jComboBox2.addItem(item);
            item = "Ton";
            jComboBox2.addItem(item);
            item = "Ounce";
            jComboBox2.addItem(item);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton c;
    private javax.swing.JButton cbrt;
    private javax.swing.JTextField cdisone;
    private javax.swing.JTextField cdistwo;
    private javax.swing.JButton ce;
    private javax.swing.JButton cosin;
    private javax.swing.JButton covert;
    private javax.swing.JButton cube;
    private javax.swing.JMenu date;
    private javax.swing.JRadioButton degree;
    private javax.swing.JTextArea displayhis;
    private javax.swing.JTextField displaymem;
    private javax.swing.JTextField displayone;
    private javax.swing.JTextField displaytwo;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton downhistoy;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton fact;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton leftbrack;
    private javax.swing.JButton log;
    private javax.swing.JButton memminus;
    private javax.swing.JButton memplus;
    private javax.swing.JButton mod;
    private javax.swing.JButton ms;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton onedivide;
    private javax.swing.JButton percentage;
    private javax.swing.JButton pi;
    private javax.swing.JButton plusminus;
    private javax.swing.JButton power;
    private javax.swing.JRadioButton radian;
    private javax.swing.JButton reset;
    private javax.swing.JButton rightbrack;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton square;
    private javax.swing.JButton sub;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JMenu time;
    private javax.swing.JButton two;
    private javax.swing.JButton uphistory;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

}
