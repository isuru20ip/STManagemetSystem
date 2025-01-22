package com.isuru20.modal;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ItemLoader {

    private static ItemLoader itemLoader;

    private ItemLoader() {
    }

    public static ItemLoader getItemLoader() {
        if (itemLoader == null) {
            itemLoader = new ItemLoader();
        }
        return itemLoader;
    }

    public void loadTable(JTable table, String query, String[] colums) throws ClassNotFoundException, SQLException, IOException {

        ResultSet rs = DB.search(query);
        DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
        defaultTableModel.setRowCount(0);

        while (rs.next()) {
            Vector<String> v = new Vector<>();
            /* 
            * assing values to the colums
            * values ectracted from the resulset accoding to the array name of arty given
             */
            for (String colum : colums) {
                v.add(rs.getString(colum));
            }
        }
        table.setModel(defaultTableModel);

    }

    public void loadCombo(JComboBox combo, String query, String[] manualValues) throws ClassNotFoundException, SQLException, IOException {

        ResultSet rs = DB.search(query);
        Vector<String> v = new Vector<>();
        for (String value : manualValues) {
            v.add(value);
        }
        // add values of the first colum of the Resulset in to combo
        while (rs.next()) {
            v.add(rs.getString(1));
        }
        DefaultComboBoxModel boxModel = new DefaultComboBoxModel(v);
        combo.setModel(boxModel);
    }

    public HashMap loadComboPlus(JComboBox combo, String query, String[] manualValues) throws ClassNotFoundException, SQLException, IOException {

        ResultSet rs = DB.search(query);
        Vector<String> v = new Vector<>();
        for (String value : manualValues) {
            v.add(value);
        }
        HashMap<String,String> map = new HashMap<>();
        
        /*
        * the first value musat be the id of the combo display vaule
        * the second value must be the combo display vale
        * load values to the given combox and return the hash map with values and it's ID
        */
        while (rs.next()) {
            v.add(rs.getString(2));
            map.put(rs.getString(2), rs.getString(1));
        }
        DefaultComboBoxModel boxModel = new DefaultComboBoxModel(v);
        combo.setModel(boxModel);
        return map;
    }

}
