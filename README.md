# Messaging-WebSocket-App

## Build from source:

    %  git clone https://github.com/RostislavDolbilov/Messaging-WebSocket-App.git


## Start the groupe messaging:

After launching application follow to localhost link in three others tabs:

    http://localhost:9999/   
              
In first field Enter your message and push send button:
<img width="987" alt="Снимок экрана 2022-03-03 в 04 04 34" src="https://user-images.githubusercontent.com/57857499/156485185-1340e803-9add-420d-bdeb-274d506200d1.png">

In every tab you will see this message in Messages field:
<img width="987" alt="Снимок экрана 2022-03-03 в 04 36 17" src="https://user-images.githubusercontent.com/57857499/156485585-42692727-5fb8-4946-be53-1e3213be30b6.png">

## Start the private messaging:

When you open new tab, every time in console you will see creating new User ID:

      : User with ID '1a68998f-a89e-4f3a-8287-7591c1659857' opened the page
      : User with ID '5c41b86d-f62a-4057-84b3-349f68f11ff5' opened the page
      : User with ID 'b0bcc18e-6354-4b6d-b37e-f5e86650cbb8' opened the page
      
<img width="987" alt="Снимок экрана 2022-03-03 в 04 39 35" src="https://user-images.githubusercontent.com/57857499/156486234-132b071b-9101-47f4-8edf-7f4f1326c19f.png">


For sending private messeger copy one of User ID (where you want to send message)
and use it with PostMan request:

      http://localhost:9999/send-private-message/ some User ID  (46686ad5-62cd-433b-8da6-cb15bbc91162)
      
And add messageContent body:

<img width="529" alt="Снимок экрана 2022-03-03 в 04 50 24" src="https://user-images.githubusercontent.com/57857499/156487061-041da749-0832-4ea8-9d9e-382d0f69b3c9.png">

After push the Send Private Messager button and you can see your message only in tab with choisen User ID:
<img width="897" alt="Снимок экрана 2022-03-03 в 04 53 27" src="https://user-images.githubusercontent.com/57857499/156487417-d5a52a83-8295-4895-8fc9-d703cf4d5b62.png">


 
    
