
package com.webserviceoliday.holidayservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HolidayService2HttpGet", targetNamespace = "http://www.holidaywebservice.com/HolidayService_v2/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HolidayService2HttpGet {


    /**
     * Get the available countries.
     * 
     * @return
     *     returns com.webserviceoliday.holidayservice.ArrayOfCountryCode
     */
    @WebMethod(operationName = "GetCountriesAvailable")
    @WebResult(name = "ArrayOfCountryCode", targetNamespace = "http://www.holidaywebservice.com/HolidayService_v2/", partName = "Body")
    public ArrayOfCountryCode getCountriesAvailable();

    /**
     * Get the available holidays for a specified country.
     * 
     * @param countryCode
     * @return
     *     returns com.webserviceoliday.holidayservice.ArrayOfHolidayCode
     */
    @WebMethod(operationName = "GetHolidaysAvailable")
    @WebResult(name = "ArrayOfHolidayCode", targetNamespace = "http://www.holidaywebservice.com/HolidayService_v2/", partName = "Body")
    public ArrayOfHolidayCode getHolidaysAvailable(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "countryCode")
        String countryCode);

    /**
     * Get the date of a specific holiday.
     * 
     * @param year
     * @param countryCode
     * @param holidayCode
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     */
    @WebMethod(operationName = "GetHolidayDate")
    @WebResult(name = "dateTime", targetNamespace = "http://www.holidaywebservice.com/HolidayService_v2/", partName = "Body")
    public XMLGregorianCalendar getHolidayDate(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "countryCode")
        String countryCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "holidayCode")
        String holidayCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "year")
        String year);

    /**
     * Get the holidays for a date range.
     * 
     * @param endDate
     * @param countryCode
     * @param startDate
     * @return
     *     returns com.webserviceoliday.holidayservice.ArrayOfHoliday
     */
    @WebMethod(operationName = "GetHolidaysForDateRange")
    @WebResult(name = "ArrayOfHoliday", targetNamespace = "http://www.holidaywebservice.com/HolidayService_v2/", partName = "Body")
    public ArrayOfHoliday getHolidaysForDateRange(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "countryCode")
        String countryCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "startDate")
        String startDate,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "endDate")
        String endDate);

    /**
     * Get the holidays for an entire year.
     * 
     * @param year
     * @param countryCode
     * @return
     *     returns com.webserviceoliday.holidayservice.ArrayOfHoliday
     */
    @WebMethod(operationName = "GetHolidaysForYear")
    @WebResult(name = "ArrayOfHoliday", targetNamespace = "http://www.holidaywebservice.com/HolidayService_v2/", partName = "Body")
    public ArrayOfHoliday getHolidaysForYear(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "countryCode")
        String countryCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "year")
        String year);

    /**
     * Get the holidays for a specific month.
     * 
     * @param month
     * @param year
     * @param countryCode
     * @return
     *     returns com.webserviceoliday.holidayservice.ArrayOfHoliday
     */
    @WebMethod(operationName = "GetHolidaysForMonth")
    @WebResult(name = "ArrayOfHoliday", targetNamespace = "http://www.holidaywebservice.com/HolidayService_v2/", partName = "Body")
    public ArrayOfHoliday getHolidaysForMonth(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "countryCode")
        String countryCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "year")
        String year,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "month")
        String month);

}
