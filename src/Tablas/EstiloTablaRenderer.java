
package Tablas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class EstiloTablaRenderer extends DefaultTableCellRenderer {

    private Component componenete;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componenete = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.       
        this.setHorizontalAlignment(0);
        this.setBorder(null);
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setShowVerticalLines(false);
        table.setShowHorizontalLines(false);
        
        if (row % 2 == 0) {
            componenete.setForeground(Color.BLACK);
            componenete.setBackground(new Color(255, 255, 255));
        } else {
            componenete.setForeground(Color.BLACK);
            componenete.setBackground(new Color(240, 240, 240));
        }
        if (isSelected) {
            componenete.setForeground(Color.white);
            componenete.setBackground(new Color(93,195,227));
            componenete.setFont(new Font("Tahoma", Font.PLAIN, 12));
        }

        return componenete;

    }

}
