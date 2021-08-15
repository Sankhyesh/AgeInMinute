import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.blue,
        appBar: AppBar(
          title: Text("I am Poor"),
          backgroundColor: Colors.blue[800],
        ),
        body: Center(
          child: Image(
            image: AssetImage("images/2EAR4MG.jpg"),
          ),
        ),
      ),
    ),
  );
}
