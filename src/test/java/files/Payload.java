package files;

public class Payload extends PropertyUtils {

     public String id;
    public String id1;
    public String token;
    public String Cnote = "" + (long) (Math.random() * 100000 + 3333300000L);
    public String Cnotebarcode= "" + (long) (Math.random() * 100000 + 3333300000L);
    String body1;
    public String Pu(String P) throws Exception {

    PropertyUtils pu = new PropertyUtils();

    P =  pu.gettingValueOfProperty("property");

    return P;
}
public String bodyFromAddress(){
        body1 = "{\n" +
                 "   \"id\":null,\n" +
                 "   \"client\":{\n" +
                 "      \"id\":1519\n" +
                 "   },\n" +
                 "   \"addressType\":\"PICKUPANDDROP\",\n" +
                 "   \"address\":{\n" +
                 "      \"id\":null,\n" +
                 "      \"detailedAddress\":\"test test test3333395798\",\n" +
                 "      \"pincode\":\"110021\",\n" +
                 "      \"state\":\"Delhi\",\n" +
                 "      \"landmark\":null\n" +
                 "   },\n" +
                 "   \"name\":\"test\",\n" +
                 "   \"phoneNumber\":\"9971639104\",\n" +
                 "   \"isAppoinmentDelivery\":false,\n" +
                 "   \"contactPerson\":\"test\",\n" +
                 "   \"status\":\"ACTIVE\",\n" +
                 "   \"organizationId\":null\n" +
                 "}" ;
         return body1;
}
public String body_to_Address(String body2){
        body2 = "{\n" +
                "  \"id\":null,\n" +
                "  \"client\":{\n" +
                "    \"id\":1519\n" +
                "  },\n" +
                "  \"addressType\":\"PICKUPANDDROP\",\n" +
                "  \"address\":{\n" +
                "    \"id\":null,\n" +
                "    \"detailedAddress\":\"test test test3333395798\",\n" +
                "    \"pincode\":\"110011\",\n" +
                "    \"state\":\"Delhi\",\n" +
                "    \"landmark\":null\n" +
                "  },\n" +
                "  \"name\":\"test\",\n" +
                "  \"phoneNumber\":\"9971639104\",\n" +
                "  \"isAppoinmentDelivery\":false,\n" +
                "  \"contactPerson\":\"test\",\n" +
                "  \"status\":\"ACTIVE\",\n" +
                "  \"organizationId\":null\n" +
                "}\n" ;
        return body2;
}
public String cnBody(String cn_body){
        cn_body = "{\n" +
                "    \"id\": null,\n" +
                "    \"cnoteType\": \"NORMAL\",\n" +
                "    \"cnote\": \""+Cnote+"\",\n" +
                "    \"clientCode\": \"UNIBC\",\n" +
                "    \"serviceType\": \"ZOOM\",\n" +
                "    \"gstNumber\": null,\n" +
                "    \"fromPinCode\": \"110021\",\n" +
                "    \"toPinCode\": \"110011\",\n" +
                "    \"totalBoxes\": \"1\",\n" +
                "    \"weight\": \"1\",\n" +
                "    \"volume\": null,\n" +
                "    \"value\": null,\n" +
                "    \"bookingDateTime\": 1632464620321,\n" +
                "    \"consignorAddress\": \"test\",\n" +
                "    \"consignorAddressId\": "+id+",\n" +
                "    \"consignorEmail\": \"testunibic@gmail.com\",\n" +
                "    \"consignorPhone\": \"9971639104\",\n" +
                "    \"consigneeAddress\": \"sdfv dvervev sc\",\n" +
                "    \"consigneeAddressId\": "+id1+",\n" +
                "    \"consigneeEmail\": null,\n" +
                "    \"consigneePhone\": \"12313131313\",\n" +
                "    \"contents\": \"Chemicals\",\n" +
                "    \"consignorName\": \"test\",\n" +
                "    \"consigneeName\": \"Rivigo costumer\",\n" +
                "    \"consignmentDocumentDtoList\": [\n" +
                "        {\n" +
                "            \"document\": \"GST Invoice / Delivery Challan\",\n" +
                "            \"status\": \"NOT_PICKED_UP\",\n" +
                "            \"minInvoiceValue\": null,\n" +
                "            \"documentType\": \"GSTIN number\",\n" +
                "            \"order\": 99\n" +
                "        },\n" +
                "        {\n" +
                "            \"document\": \"CN consignee copy\",\n" +
                "            \"status\": \"NOT_PICKED_UP\",\n" +
                "            \"minInvoiceValue\": null,\n" +
                "            \"order\": 2\n" +
                "        },\n" +
                "        {\n" +
                "            \"document\": \"CN POD copy\",\n" +
                "            \"status\": \"NOT_PICKED_UP\",\n" +
                "            \"minInvoiceValue\": null,\n" +
                "            \"order\": 1\n" +
                "        }\n" +
                "    ],\n" +
                "    \"packing\": \"Bundle\",\n" +
                "    \"barcodeType\": \"PRE_PRINTED\",\n" +
                "    \"barcodes\": [\n" +
                "        "+Cnotebarcode+"\n" +
                "    ],\n" +
                "    \"isDacc\": null,\n" +
                "    \"invoices\": [\n" +
                "        {\n" +
                "            \"invoiceId\": null,\n" +
                "            \"invoiceNo\": \"1\",\n" +
                "            \"invoiceValue\": \"1\",\n" +
                "            \"eWaybillNumber\": \"\",\n" +
                "            \"hsnCodes\": null\n" +
                "        }\n" +
                "    ],\n" +
                "    \"volumeDetails\": [\n" +
                "        {\n" +
                "            \"unit\": \"IN\",\n" +
                "            \"breadth\": \"1\",\n" +
                "            \"height\": \"1\",\n" +
                "            \"numberOfBoxes\": \"1\",\n" +
                "            \"length\": \"1\",\n" +
                "            \"volume\": 0.0006\n" +
                "        }\n" +
                "    ],\n" +
                "    \"valueAddedServicesDTO\": null,\n" +
                "    \"paymentDetailsDTO\": null,\n" +
                "    \"gstDetailsDTO\": null,\n" +
                "    \"taxId\": null,\n" +
                "    \"taxIdType\": null,\n" +
                "    \"trackerDTO\": {\n" +
                "        \"deviceIdType\": \"IP\",\n" +
                "        \"deviceType\": \"ZOOM_OPS\"\n" +
                "    },\n" +
                "    \"openPopupTime\": 1573037386291,\n" +
                "    \"allIssuesResolved\": true,\n" +
                "    \"billingEntity\": \"UNIBIC FOODS INDIA PVT LTD.\",\n" +
                "    \"vehicleNumber\": \"HR55V5525\",\n" +
                "    \"consignmentCodDodDTO\": null,\n" +
                "    \"deliveryType\": \"NORMAL\",\n" +
                "    \"completionStatus\": \"COMPLETE\"\n" +
                "}" ;
        return cn_body;
}
}



