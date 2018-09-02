package guru.springframework.converters;

import guru.springframework.commands.UnitOfMeasureCommand;
import guru.springframework.domain.UnitOfMeasure;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class UnitOfMeasureCommandToUnitOfMeasure  implements Converter<UnitOfMeasureCommand, UnitOfMeasure> {

    @Synchronized //makes it thread safe so we can run in multiple environment since spring does not guarantee thread safety
    @Nullable
    @Override
    public UnitOfMeasure convert(UnitOfMeasureCommand source) {

        if(source == null) {
            return null;
        }

        //declaring vars final so that they are immutable ensuring code security
        final UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(source.getId());
        uom.setDescription(source.getDescription());
        return uom; //return instance
    }
}
