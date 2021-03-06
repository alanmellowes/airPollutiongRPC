from __future__ import print_function

import grpc
import bidirectional_pb2_grpc as bidirectional_pb2_grpc
import bidirectional_pb2 as bidirectional_pb2


def make_message(message):
    return bidirectional_pb2.Message(
        message=message
    )


def generate_messages():
    messages = [
        make_message("Italy air pollution is moderate"),
        make_message("France air pollution is good"),
        make_message("England air pollution is bad"),
        make_message("Japan air pollution is better than normal"),
        make_message("Finland air pollution is good"),
    ]
    for msg in messages:
        print("Online it says %s" % msg.message)
        yield msg


def send_message(stub):
    responses = stub.GetServerResponse(generate_messages())
    for response in responses:
        print("Server has received your review: %s" % response.message)


def run():
    with grpc.insecure_channel('localhost:50051') as channel:
        stub = bidirectional_pb2_grpc.BidirectionalStub(channel)
        send_message(stub)


if __name__ == '__main__':
    run()
