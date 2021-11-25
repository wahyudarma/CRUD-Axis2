package com.wahyu.services;

import com.wahyu.model.Office;
import java.util.List;
import java.util.ArrayList;

public class OfficeServices
{
    //    get Office Data
    private List<Office> officeList = new ArrayList<>();

    // Add Office
    public void addOffice(Office o)
    {
        System.out.println("{addOffice} Adding:[" + o.getId() + "," + o.getName() + "]");
        officeList.add(o);
    }
    // get office
    public List<Office> getAllOffice()
    {
        System.out.println("{getAllOffice}:: start");
        return officeList;
    }
    // get Office by name
    public List<Office> getOfficeByName(String names)
    {
        System.out.println("{getOfficeByName}:: start");
        List<Office> offices = new ArrayList<Office>();

        for (Office o: officeList)
        {
            if (o.getName().equals(names))
            {
                offices.add(o);
            }
        }
        return offices;
    }
}
