<?php  
  $client = new SoapClient("wsdl.xml");

  
  $param = array('phone' => "+123456123234");
  $response = $client->validate($param);

  var_dump($response->return);
?>