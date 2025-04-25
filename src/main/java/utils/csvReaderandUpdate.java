package utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.Test;
import pageObjects.BasePage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class csvReaderandUpdate{
    static Properties properties;
    static {
         properties=FetchProperties.fetchConfigValues();

    }

    public static void orderDelivery(String order_id){
        String orderDeliveryPath= FetchProperties.fetchAbsoluteFilePath(properties.getProperty("order_delivery_path"));
        try {
            CSVReader csvReader=new CSVReader(new FileReader(orderDeliveryPath));
            List<String[]> rows=csvReader.readAll();
            csvReader.close();
            if(rows.size()>0){
                for(int i= rows.size()-1;i>0;i--){
                    rows.remove(i);
                }
                String[] orderDetails={order_id,DateTimeUtilities.tomorrow(),DateTimeUtilities.currentTime(),properties.getProperty("Delivery_partner_number"),properties.getProperty("Remark"),""};
                rows.add(1,orderDetails);

            }
            CSVWriter writer=new CSVWriter(new FileWriter(orderDeliveryPath));
            writer.writeAll(rows);
            writer.close();



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
