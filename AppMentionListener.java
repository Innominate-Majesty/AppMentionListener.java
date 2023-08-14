// package listeners.events;

// import com.slack.api.app_backend.events.payload.EventsApiPayload;
// import com.slack.api.bolt.App;
// import com.slack.api.bolt.context.builtin.EventContext;
// import com.slack.api.bolt.handler.BoltEventHandler;
// import com.slack.api.bolt.response.Response;
// import com.slack.api.model.event.AppMentionEvent;

// public class AppMentionListener implements BoltEventHandler<AppMentionEvent> {

//     private final App app;

//     public AppMentionListener(App app) {
//         this.app = app;
//     }

//     @Override
//     public Response apply(EventsApiPayload<AppMentionEvent> payload, EventContext ctx) {
//         ctx.say("Hello!"); // Respond with a simple greeting
//         return ctx.ack();
//     }
// }

// public class AppMentionListener implements BoltEventHandler<AppMentionEvent> {

//     @Override
//     public Response apply(EventsApiPayload<AppMentionEvent> payload, EventContext ctx)
//             throws IOException, SlackApiException {
//         // Respond to the mention
//         // String text = "";
//         // ctx.say(text);
//         return ctx.ack();
//     }
// }
