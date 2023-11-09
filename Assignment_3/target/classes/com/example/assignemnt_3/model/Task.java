����   = :
      java/lang/Object <init> ()V  +com/fasterxml/jackson/databind/ObjectMapper
  
     writeValueAsString &(Ljava/lang/Object;)Ljava/lang/String;  #com/example/assignemnt_3/model/Task
     	readValue 7(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;	     id Ljava/lang/String;	     description	     	completed Z Code LineNumberTable LocalVariableTable this %Lcom/example/assignemnt_3/model/Task; toJson ()Ljava/lang/String; mapper -Lcom/fasterxml/jackson/databind/ObjectMapper; 
Exceptions * 2com/fasterxml/jackson/core/JsonProcessingException fromJson 9(Ljava/lang/String;)Lcom/example/assignemnt_3/model/Task; json MethodParameters getId getDescription isCompleted ()Z setId (Ljava/lang/String;)V setDescription setCompleted (Z)V 
SourceFile 	Task.java !                     	        /     *� �             !        " #    $ %     F     � Y� 	L+*� 
�        
       !        " #     & '  (     ) 	 + ,     K     � Y� 	L+*� � �        
       !        -      & '  (     ) .    -    / %     /     *� �             !        " #    0 %     /     *� �             !        " #    1 2     /     *� �             !        " #    3 4     :     *+� �             !        " #         .       5 4     :     *+� �             !        " #         .       6 7     :     *� �             !        " #         .       8    9