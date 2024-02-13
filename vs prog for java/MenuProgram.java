import javax.swing.*;

public class MenuProgram {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();
        JMenu filemenu = new JMenu("File");
        JMenu viewmenu = new JMenu("View");
        JMenu editmenu = new JMenu("Edit");
        JMenu helpmenu = new JMenu("Help");

        JMenuItem newitem = new JMenuItem("New");
        JMenuItem openitem = new JMenuItem("Open");
        JMenuItem saveitem = new JMenuItem("Save               Ctrl+S");
        JMenuItem printitem = new JMenuItem("Print             Ctrl+P");
        JMenuItem SaveAsitem = new JMenuItem("SaveAs         Ctrl+Shift+S");
        JMenuItem exititem = new JMenuItem("Exit               Alt+F4");


        JMenuItem cutitem = new JMenuItem("Cut");
        JMenuItem undoitem = new JMenuItem("Undo");
        JMenuItem pasteitem = new JMenuItem("Paste");

        JMenuItem zoomitem = new JMenuItem("Zoom");
        JMenuItem statusitem = new JMenuItem("Statusbar");

        JMenuItem ShowAllCommandsitem = new JMenuItem("ShowAllCommands");
        JMenuItem EditorPlayground = new JMenuItem("EditorPlayground");
        JMenuItem ReportIssue = new JMenuItem("ReportIssue");
        JMenuItem Aboutitem = new JMenuItem("About");
        JMenuItem ViewLicenseitem = new JMenuItem("View License");


        filemenu.add(newitem);
        filemenu.add(openitem);
        filemenu.add(saveitem);
        filemenu.add(SaveAsitem);
        filemenu.addSeparator();
        filemenu.add(printitem);
        filemenu.addSeparator();
        filemenu.add(exititem);

        viewmenu.add(cutitem);
        viewmenu.add(undoitem);
        viewmenu.add(pasteitem);

        editmenu.add(zoomitem);
        editmenu.add(statusitem);

        helpmenu.add(ShowAllCommandsitem);
        helpmenu.add(EditorPlayground);
        helpmenu.addSeparator();
        helpmenu.add(ReportIssue);
        helpmenu.addSeparator();
        helpmenu.add(Aboutitem);
        helpmenu.add(ViewLicenseitem);

        menubar.add(filemenu);
        menubar.add(viewmenu);
        menubar.add(editmenu);
        menubar.add(helpmenu);

        newitem.addActionListener(e -> JOptionPane.showMessageDialog(null,"New action"));
        openitem.addActionListener(e->JOptionPane.showMessageDialog(null, "Open action"));
        saveitem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Save action"));
        SaveAsitem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Save As action"));
        printitem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Print action"));
        exititem.addActionListener(e -> System.exit(0));
        cutitem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Cut action"));
        undoitem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Undo action"));
        pasteitem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Paste action"));
        zoomitem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Zoom action"));
        statusitem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Status bar action"));
        ShowAllCommandsitem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Show all commands action"));        





        frame.setJMenuBar(menubar);
        frame.setVisible(true);
    }
}