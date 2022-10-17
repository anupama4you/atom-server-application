# atom-server-application

Using a client-server architecture, this project designs and develops a straightforward system that collects and feeds an Atom client-server system. The client-server architecture is used throughout. By utilizing a thread-perrequest architecture on the server, the system enables concurrent clients to edit or query the distant dictionary. This is made possible by the server. The HTTP protocol is used by the system to ensure that there is reliable communication between the server and the clients. In addition, JSON is utilized in the system in order to supply a protocol for the transfer of messages between the server and clients. Errors like as I/O errors, Network Connection error, and parameter failures are handled correctly on both the server and client sides during the failure handling process. Other types of errors that may occur include: Additionally, illegal requests made by clients can be identified and appropriately dealt with by the server. These requests can include things like adding a term that is already in the feeds, removing or querying a word that does not exist, or adding a word that has no meaning.
In addition to that, the server is able to manage multiple requests at the same time and change the data in the appropriate manner.

# system components 

1. Server
The server is built with a thread-per-request architecture and has the ability to identify and cope with numerous errors simultaneously. The server would start a new thread for each new request that was made to it by clients so that it could process the request and respond to it. Because it makes use of multi-thread technology, the server is able to manage requests coming from a variety of clients all at the same time. When it comes to the alteration of data, on the other hand, there will be no room for uncertainty because the relative functions given by the feeds controller are synchronized. This will ensure that any changes made to the data in the dictionary are accurate. 
Depending on the individual situation, the server will process requests in a variety of various ways and will send back to clients a variety of distinct states (which identify the specific implementation) and feedbacks. Before being sent back to customers, each response would first be encoded in the JSON format, which would allow for a more efficient exchange of messages with customers. The server offers a graphical user interface (GUI) for logging actions and displaying information about the server, in addition to the length of the word and its meaning as provided by users.

2. Client 
The client can be broken down into two main components: the Client's Controller and the Client's Graphical User Interface. It is able to detect and handle issues such as problems with network communication and incorrect parameter input, among other types. The part of the Client known as the Controller is in charge of addressing the user's operational requirements after they have been gathered by the GUI. The controller will open a new TCP connection with the server for each ADD, DELETE, and QUERY action that is issued by the user. This connection will be closed as soon as the controller receives the response that is issued by the server. Before carrying out the aforementioned three processes, the client in this scenario would not check to see if the server is now operational. Users will be able to make advantage of visual interfaces if the GUI is implemented with Swing.
It not only satisfies the user's query and modification operations, but it also prompts the user how to use the client. For example, it may ask the user to type a word before pressing the ADD button or the REMOVE button, which can result in an improved experience for the user.

# Application architecture

client architecture 
![image](https://user-images.githubusercontent.com/43500022/196088992-84c4e6e9-76a1-4956-9c49-f279ae04f301.png)

As soon as the client begins its execution, it will first determine whether or not the server's address and port have been specified. After that, it would validate the forms of the parameters to ensure that they are accurate. The client would not attempt to check for updates or establish a connection to the server before the user carried out any of the following operations: ADD, DELETE, or QUERY.
If the user attempts to carry out any of the three operations, the client will initially do a check to ensure that the information being requested has not been altered in any way. After then, it would attempt to establish a connection with the server via the HTTP protocol. In the event that the client is unable to establish a connection with the server, the program will prompt the user to restart the application while using the correct IP address and port.
In addition to this, the client gives users with an adaptable window that can prevent the Out-Of-Bounds text issue from occurring. Additionally, some helpful hints would appear in the appropriate windows whenever a user tries to do an action in the incorrect manner.

![image](https://user-images.githubusercontent.com/43500022/196089083-9eeba072-b445-4d46-91df-221e333b89ba.png)

# Server architecture
![image](https://user-images.githubusercontent.com/43500022/196089100-2513b20b-5d14-49bb-b137-57c830a8e05e.png)

When the server is started, it will first check to see if the feed's path and the server's port are specified. After that, it would attempt to read from the stream while simultaneously determining whether or not the formats of the parameters are correct. The server will generate a default feed in the event that the specified feeds do not already exist or if the format used in the feed file is not valid.
When a client sends a request to the server, the server responds. It would initiate a new thread specifically for processing the request. The server would handle requests in a variety of different ways depending on the circumstances at hand, and it would send back to clients a variety of various states and feedbacks.
In addition to that, the server offers an adaptable window that helps prevent the Out-Of-Bounds text issue from occurring. Its purpose is to record the functioning of the system while also providing information that is helpful regarding the server. 

![image](https://user-images.githubusercontent.com/43500022/196089129-c01b299a-dfd4-4bb0-a417-695402a114a8.png)

# Application interaction architecture
![image](https://user-images.githubusercontent.com/43500022/196089174-5733db79-d34d-47c8-a024-8d70405272f9.png)




