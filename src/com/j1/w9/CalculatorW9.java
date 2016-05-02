package com.j1.w9;

import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.math.MathContext;

class CalculatorW9 extends Frame implements ActionListener{
  Panel p1, p2;
  Label la1,la2;
  String str[] = {"CE","C","←","/","1/x","7","8","9","*","Bin","4","5","6","-","Oct","1","2","3","+","Hex","±","0",".","="};
  Button bt[] = new Button[str.length];
  String lanum1 = "";
  String lanum2 = ""; 
  String lanum0 = ""; 
  String bun [] = {"","","",""}; 
  String tr ="";
  int cnt=0;
 public CalculatorW9()
 {
  super("Calc");
  p1 = new Panel(new GridLayout(2,1)); 
  la1 = new Label("",Label.RIGHT);
  la2 = new Label("0",Label.RIGHT);
  Font f1 = new Font("보통",Font.BOLD,15);
  Font f2 = new Font("보통",Font.BOLD,20);
  la1.setFont(f1);
  la2.setFont(f2);
  
  p1.add(la1);
  p1.add(la2);
  add(p1,"North");

  p2 = new Panel(new GridLayout(5,5,5,5));
  for(int i=0; i<bt.length;i++)
  {
   bt[i] = new Button(str[i]);
   bt[i].setBackground(Color.LIGHT_GRAY);
   bt[i].setFont(new Font("보통",Font.BOLD,15));
   p2.add(bt[i]);
   bt[i].addActionListener(this);
  }
  add(p2,"Center");
  
  
  
  setBounds(800,300,400,500);
  setVisible(true);
  setResizable(false);
  addWindowListener
  (
   new WindowAdapter()
   {
    public void windowClosing(WindowEvent e)
    {
     System.exit(0);
    }
   }
  );
 }
 public void actionPerformed(ActionEvent e)
 {
  String com = e.getActionCommand();
  if(com.equals("1")||com.equals("2")||com.equals("3")||com.equals("4")||com.equals("5")||com.equals("6")||com.equals("7")||com.equals("8")||com.equals("9"))
  {
   lanum2 += com;
   la2.setText(lanum2);
  }
  else if(com.equals("←"))
  {
   int len = la2.getText().length();
   if(len == 1)
   {
    lanum2 = "";
    la2.setText("0");
   }
   else
   {
    if(!lanum2.equals(""))
    {
     lanum2 = lanum2.substring(0,len-1);
     la2.setText(lanum2);
    }
   }

  }
  else if(com.equals("CE"))
  {
   lanum2 = "";
   la2.setText("0");
  }
  else if(com.equals("C"))
  {
   lanum0 ="";
   lanum1 ="";
   lanum2 ="";
   la1.setText("");
   la2.setText("0");
   bun[0] ="";
   bun[1] ="";
   bun[2] ="";
  }
  else if(com.equals("."))
  { 
   if(lanum2.equals(""))
   {
    if(lanum2.indexOf(".") == -1)
    {
     lanum2 = "0"+com;
    }
   }
   else
   {
    if(lanum2.indexOf(".")==-1)
    {
     lanum2 += com;
    }
   }
   la2.setText(lanum2);
  }
  else if(com.equals("0"))
  {
   if(lanum2.equals("0"))
   {
    lanum2 = "0";
   }
   else
   {
    lanum2 = lanum2 + com;
   }
   la2.setText(lanum2);
  }
  else if(com.equals("*")||com.equals("/")||com.equals("+")||com.equals("-"))
  {
   if(lanum1.equals(""))
   {
    if(lanum2.equals(""))
    {
     if(lanum0.equals(""))
     {
      lanum1 = "0"+com;
      bun[0] = "0";
     }
     else
     {
      lanum1 = lanum0 + com;//최종 결과에다가 다시 연산할 때.
     }
    }
    else
    {
     if(!lanum0.equals(""))
     {
      lanum1 = lanum0 + com;
     }
     lanum1 = lanum2 + com;
     bun[0] = lanum2;
    }
    bun[1] = com;
   }
   else
   {
    if(lanum2.equals("")) 
    {
     lanum1 = lanum1.substring(0,lanum1.length()-1) + com; 
     bun[1] = com;
    }
    else
    {
     if(cnt>=1)
     {
      if(com.equals("*") || com.equals("/"))
      {
      lanum2 = "1";
      }
      else
       lanum2 = "0";
     }
     lanum1 += lanum2 +com;
     bun[2] = lanum2;
     lanum0 = Cal();
     bun[1] = com;
     la2.setText(lanum0);
     bun[0] = lanum0;
    }
    cnt = 0;
   }
   if(lanum0.equals("0으로 나눌 수 없다"))
   {
    lanum1 = "";
    lanum2 = "";
    lanum0 = "";
    bun[0] = "";
    bun[1] = "";
    bun[2] = "";
   }
   lanum2="";
   la1.setText(lanum1);
  }
  else if(com.equals("="))
  {
   cnt+=1;
   if(!lanum2.equals(""))
   {
    bun[2] = lanum2;
    la1.setText("");
   }
   
   bun[0]=Cal();
   la2.setText(bun[0]);
   if(bun[1].equals("/") && lanum2.equals("0"))
   {
    lanum1 = "";
    lanum2 = "";
    lanum0 = "";
    bun[0] = "";
    bun[1] = "";
    bun[2] = "";
    la2.setText("0으로 나눌 수 없다");
   }
  }
  else if(com.equals("Bin") || com.equals("Oct") ||com.equals("Hex"))
  {
    if(bun[0].equals(""))
    {
     if(!lanum2.equals("0"))
     {
      if(com.equals("Bin"))
      {
       tr = "b";
      }
      else if(com.equals("Oct"))
      {
       tr = "o";
      }
      else
      {
       tr ="h";
      }
      bun[3] = Trans();
     }
    }
    else
    {
     if(com.equals("Bin"))
      {
       tr = "b1";
      }
      else if(com.equals("Oct"))
      {
       tr = "o1";
      }
      else
      {
       tr ="h1";
      }
     bun[3] = Trans();
    }
   la1.setText(bun[3]);
  }
 }
 public String Cal() 
 {
  String sum ="";
  BigDecimal big1 = new BigDecimal(bun[0]);
  BigDecimal big2 = new BigDecimal(bun[2]);
  Double dou=new Double(0);
  if(bun[1].equals("*"))
  {
   if(bun[0].indexOf(".") != -1 || bun[2].indexOf(".") != -1)
   {
    dou = big1.multiply(big2,MathContext.DECIMAL32).doubleValue();//바로 toString에 넣으면 뒤에 .0000이 잘리지 않는다.
    sum += dou.toString();
   }
   else
    sum += Integer.parseInt(bun[0]) * Integer.parseInt(bun[2]);
  }
  if(bun[1].equals("-"))
  {
   if(bun[0].indexOf(".") != -1 || bun[2].indexOf(".") != -1)
   {
    dou = big1.subtract(big2,MathContext.DECIMAL32).doubleValue();
    sum += dou.toString();
   }
   else
    sum += Integer.parseInt(bun[0]) - Integer.parseInt(bun[2]);
  }
  if(bun[1].equals("+"))
  {
   if(bun[0].indexOf(".") != -1 || bun[2].indexOf(".") != -1)
   {
    dou = big1.add(big2,MathContext.DECIMAL32).doubleValue();
    sum += dou.toString();
   }
   else
    sum += Integer.parseInt(bun[0]) + Integer.parseInt(bun[2]);
  }
  if(bun[1].equals("/"))
  {
   if(bun[0].indexOf(".") != -1 || bun[2].indexOf(".") != -1)
   {
    try
    {
     dou = big1.divide(big2,MathContext.DECIMAL32).doubleValue();
     sum += dou.toString();
    }
    catch (ArithmeticException e)
    {
     sum += "0으로 나눌 수 없다";
    }
    
   }
   else
   {
    try
    {
     sum += Integer.parseInt(bun[0]) / Integer.parseInt(bun[2]);
    }
    catch (ArithmeticException e)
    {
     sum += "0으로 나눌 수 없다";
    }
    
   }
  }
  return sum;
 }

 public String Trans()
 {
  String result ="";
  long tr1 = 0;
  if(tr == "b")
  {
   tr1 = Long.parseLong(lanum2);
   result += Long.toBinaryString(tr1); 
  }
  else if(tr=="b1")
  {
   tr1 = Long.parseLong(bun[0]);
   result += Long.toBinaryString(tr1);
  }
  else if(tr == "o")
  {
   tr1 = Long.parseLong(lanum2);
   result += Long.toOctalString(tr1);
  }
  else if(tr == "o1")
  {
   tr1 = Long.parseLong(bun[0]);
   result += Long.toOctalString(tr1);
  }
  else if(tr == "h")
  {
   tr1 = Long.parseLong(lanum2);
   result += Long.toHexString(tr1);
  }
  else
  {
   tr1 = Long.parseLong(bun[0]);
   result += Long.toHexString(tr1);
  }

   return result;
 }
 
 public static void main(String[] args) 
 {
  new CalculatorW9();
 }
}