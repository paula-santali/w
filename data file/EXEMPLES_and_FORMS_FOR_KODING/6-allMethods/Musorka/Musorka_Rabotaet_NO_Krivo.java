
/*	
 * 
 BugRepOpen testerBugs[]=new BugRepOpen[bugs.length];
  for(int i=0,j=0;i<bugs.length;i++){
  String name=bugs.getTesterName();
  if(testerName.equals(name))
  testerBugs[j++]=bugs[i];
}
return Arrays.copyOf(testerBugs,j);
  
private static BugRepOpen[] getBugsByTester(BugRepOpen[] bugs,String name) {
BugRepOpen newBugs[]=new BugRepOpen[bugs.length];
for(int i=0;i<bugs.length;i++){
	newBugs[i]=getBugs(bugs[i],name);
}
return newBugs;
}
private static BugRepOpen getBugs(BugRepOpen bugOen, String name) {
String str=bugOen.getTestername();
if(str.equalsIgnoreCase(name)){
	return bugOen;
}
return null;
}



private static BugRepOpen[] getBugsBefore(BugRepOpen[] bugs, Date date) {
BugRepOpen newBugs[]=new BugRepOpen[N_BUGS];
for(int i=0;i<N_BUGS;i++){
	newBugs[i]=get2Bugs(bugs[i],date);
}
return newBugs;
}
private static BugRepOpen get2Bugs(BugRepOpen bugOen, Date date) {
Date datE=bugOen.getOpendate();
if(datE.before(date)){
	return bugOen;
}
return null;
}


*
*
*
	//действие при нажатии кнопки да
	static class Action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//создаем окно благодарности
			JFrame frame=new JFrame("Answer");
			frame.setVisible(true);
			frame.setSize(100, 90);
			frame.setAlwaysOnTop(true);
			// создаем надпись внутри поля frame
			JLabel label=new JLabel("Cпасибо");
			JPanel panel=new JPanel();
			panel.setBackground(Color.green);
			panel.add(label);
			frame.add(panel);

		}
	}

		//действия при нажатии кнопки sendSms
		class sendSms implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				//создаем рабочее  окно для смс чата	
				JFrame frame=new JFrame("Messenger");
				frame.setVisible(true);
				frame.setAlwaysOnTop(true);
				frame.setBounds(1000, 20, 250, 500);
				JPanel panel=new JPanel();
				panel.setBackground(Color.green);				
				frame.add(panel);
				//создание меню бара.		
				JMenuBar meny=new JMenuBar();
				frame.setJMenuBar(meny);
				JMenu file=new JMenu("File");
				meny.add(file);
				//создание кнопки в меню баре
				JMenuItem exit = new JMenuItem("Exit");
				file.add(exit);
				JMenuItem smaile = new JMenuItem("Smaile");
				file.add(smaile);
				 // Создаем многострочное поле для ввода текста
				TextArea text = new TextArea(20,30);
				// Добавим многострочное поле для ввода текста в апплет
				panel.add(text);  
				// Установим серый фон для апплета
				text.setBackground(Color.lightGray);
				//создание кнопкy Send
				JButton send=new JButton("Send");
				panel.add(send);
			}
		}
		//действие при выборе в меню file кнопки About
		class About implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				String str="Если эта программа работает корректно и " +
				"не вызывает хлопот!!! то её создатель будет благодарен за поддержку " +
				"и понимание, если же программа не работает! то я не знаю кто писал " +
				"этот код :)";
				JFrame frame=new JFrame("Answer");
				frame.setVisible(true);
				frame.setAlwaysOnTop(true);
				frame.setBounds(1000, 20, 300, 300);
				JPanel panel=new JPanel();
				frame.add(panel);
				TextArea text = new TextArea(2,3);
				panel.add(text); 
				text.setBackground(Color.green);
				text.insert(str, 0);
			}
		}



*/