// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secondUser.proto

package login_service2;

public interface CalculateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CalculateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float number1 = 1;</code>
   */
  float getNumber1();

  /**
   * <code>float number2 = 2;</code>
   */
  float getNumber2();

  /**
   * <code>.CalculateRequest.Operation operation = 3;</code>
   */
  int getOperationValue();
  /**
   * <code>.CalculateRequest.Operation operation = 3;</code>
   */
  login_service2.CalculateRequest.Operation getOperation();
}