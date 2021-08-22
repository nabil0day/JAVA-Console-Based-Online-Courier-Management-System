public class Parcel
       {
       private String destination;
       private String estimatdDeliveryDate;
       private Boolean confirmation;
       private Double aproxweight;
       private String catagory;
       private int quantity;
       private String hub;
       private int protectiveLayer;
       private Sender sender;
       private Reciver reciver;
       private boolean picked;

       private String track;

       public Parcel(String destination,String estimatdDeliveryDate,Boolean confirmation,Double aproxweight,String catagory,int quantity,String hub,int protectiveLayer,Sender sender, Reciver reciver)
       {
            this.destination=destination;
            this.estimatdDeliveryDate=estimatdDeliveryDate;
            this.confirmation=confirmation;
            this.aproxweight=aproxweight;
            this.catagory = catagory;
            this.quantity=quantity;
            this.hub=hub;
            this.protectiveLayer=protectiveLayer;
            this.sender = sender;
            this.reciver = reciver;
            this.track = "Processing...";
       }

       public void setPicked(boolean picked)
       {
            this.picked = picked;
       }
       public boolean getPicked()
       {
            return picked;
       }

       public void setTrack(String track)
       {
            this.track = track;
       }
       public String getTrack()
       {
            return track;
       }
       public void setDestination(String destination)
       {
             this.destination=destination;
       }
      public String getDestination()
      {
            return destination;
      }
      public void setEstimatdDeliveryDate(String estimatdDeliveryDate)
      {
            this.estimatdDeliveryDate=estimatdDeliveryDate;
      }

      public String getEstimatdDeliveryDate()
      {
            return estimatdDeliveryDate;
      }

      public void setConfirmation(Boolean confirmation)
      {
            this.confirmation=confirmation;
      }
      public Boolean getConfirmation()
      {
            return confirmation;
      }

      public void setAproxweight(Double aproxweight)
      {
            this.aproxweight=aproxweight;
      }
      public Double getAproxweight()
      {
            return aproxweight;
      }

      public void setCatagory(String catagory)
      {
        this.catagory = catagory;
      }

      public String getCatagory()
      {
        return catagory;
      }
      public void setQuantity(int quantity)
      { this.quantity=quantity;

      }
      public int getQuantity()
      {
            return quantity;
      }
      public void setHub(String hub)
      {
            this.hub=hub;
      }
      public String getHub()
      {
            return hub;
      }
      public void setProtectiveLayer(int protectiveLayer)
      {
            this.protectiveLayer=protectiveLayer;
      }
      public int getProtectiveLayer()
      {
            return protectiveLayer;
      }
      public void setSender(Sender sender)
      {
            this.sender = sender;
      }
      public Sender getSender()
      {
            return sender;
      }
      public void setReciver(Reciver sender)
      {
            this.reciver = reciver;
      }
      public Reciver getReciver()
      {
            return reciver;
      }

      public void showInfo()
      {
            System.out.println("Destination is - "+destination);
            System.out.println("Estimated Delivery Date is - "+estimatdDeliveryDate);
            System.out.println("confirmation - "+confirmation);
            System.out.println("aprox weight is - "+aproxweight);
            System.out.println("quantity is - "+ quantity);
            System.out.println("Hub - "+hub);
            System.out.println("Protective layer - "+protectiveLayer);
            sender.showInfo();
            reciver.showInfo();
      }
}