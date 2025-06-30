package com.example12.rowMapperdemo.daos;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example12.rowMapperdemo.model.Locations;
@Repository("locDao")
public class LocationDAOImp implements ILocationDAO
{
    private static final String LOC_DETAILS="SELECT LOCATION_ID,STREET_ADDRESS,POSTAL_CODE,CITY FROM LOCATIONS WHERE LOCATION_ID=?";
    @Autowired
    private JdbcTemplate jt;

    @Override
    public Locations getLocationById(int lno) 
    {
        Locations l=jt.queryForObject(LOC_DETAILS,new LocationMapper(),lno);
        return l;
    }
    private class LocationMapper implements RowMapper<Locations>
    {

        @Override
        public Locations mapRow(ResultSet rs, int rowNum) throws SQLException 
        {
            Locations loc=new Locations();
            loc.setLoc_id(rs.getInt(1));
            loc.setStreet_address(rs.getString(2));
            loc.setPostal_code(rs.getString(3));
            loc.setCity(rs.getString(4));
            return loc;
        }
            
    }
    
}
