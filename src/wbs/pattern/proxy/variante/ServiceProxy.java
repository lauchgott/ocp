package wbs.pattern.proxy.variante;



import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class ServiceProxy implements IService {
        
        private IService service;

        private LocalTime from = LocalTime.of(8,0);
        private LocalTime to = LocalTime.of(12,0);
        private String msg = "local time is %s. access is only allowed between %s and %s";
        private DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        public ServiceProxy(IService service) {
                this.service = service;
        }

        @Override
        public void m() {
                LocalTime now = LocalTime.now();
                if(now.isBefore(from) || now.isAfter(to)) {
                        throw new IllegalAccessTimeException(
                                String.format(msg,formatter.format(now),from,to));
                }

                        System.out.println("in m() von " + getClass().getSimpleName());
                        System.out.println("extra stuff from proxy before calling m() von service implementation...");
                        // delegation:
                        // reicht ein objekt den aufruf einer methode für dieses objekt an ein anderes objekt weiter,
                        // auf das es eine referenz hat, spricht man von delegation
                        service.m();
                        System.out.println("extra stuff from proxy after calling m() von service implementation...");

        }
}